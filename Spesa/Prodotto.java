package Spesa;

public class Prodotto {
    String codice;
    String descrizione;
    double costo;

    public Prodotto(String codice, String descrizione, double costo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.costo = costo;
    }

    public String toString() {
        return "Codice: " + codice + ", Descrizione: " + descrizione + ", Costo: " + costo;
    }
}