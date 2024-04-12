package Spesa;

import java.io.IOException;
import java.io.PrintWriter;

public class Lista {
    Nodo radice;

    public Lista() {
        this.radice = null;
    }

    public void aggiungiInCoda(Prodotto prodotto) {
        Nodo nuovoNodo = new Nodo(prodotto);
        if (radice == null) {
            radice = nuovoNodo;
        } else {
            Nodo tmp = radice;
            while (tmp.successivo != null) {
                tmp = tmp.successivo;
            }
            tmp.successivo = nuovoNodo;
        }
    }

    public Prodotto rimuoviUltimo() {
        if (radice == null) {
            return null;
        }
        if (radice.successivo == null) {
            Prodotto valoreRimosso = radice.valore;
            radice = null;
            return valoreRimosso;
        }
        Nodo tmp = radice;
        while (tmp.successivo.successivo != null) {
            tmp = tmp.successivo;
        }
        Prodotto valoreRimosso = tmp.successivo.valore;
        tmp.successivo = null;
        return valoreRimosso;
    }

    public void rimuoviByCodice(String codice) {
        if (radice == null) {
            return;
        }
        if (radice.valore.codice.equals(codice)) {
            radice = radice.successivo;
            return;
        }
        Nodo tmp = radice;
        while (tmp.successivo != null && !tmp.successivo.valore.codice.equals(codice)) {
            tmp = tmp.successivo;
        }
        if (tmp.successivo != null) {
            tmp.successivo = tmp.successivo.successivo;
        }
    }

    public double calcolaCostoTotale() {
        double costoTotale = 0;
        Nodo tmp = radice;
        while (tmp != null) {
            costoTotale += tmp.valore.costo;
            tmp = tmp.successivo;
        }
        return costoTotale;
    }

    public void stampa() {
        Nodo tmp = radice;
        while (tmp != null) {
            System.out.println(tmp.valore.descrizione + " - " + tmp.valore.costo);
            tmp = tmp.successivo;
        }
    }

    public void salvaSuFile(String nomeFile) {
        try {
            PrintWriter writer = new PrintWriter(nomeFile);
            Nodo tmp = radice;
            while (tmp != null) {
                writer.println(tmp.valore.codice + "," + tmp.valore.descrizione + "," + tmp.valore.costo);
                tmp = tmp.successivo;
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio su file: " + e.getMessage());
        }
    }
}