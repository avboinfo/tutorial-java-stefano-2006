package Spesa;

public class Spesa {
    Lista prodotti;

    public Spesa() {
        this.prodotti = new Lista();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.aggiungiInCoda(prodotto);
    }

    public void eliminaUltimoProdotto() {
        prodotti.rimuoviUltimo();
    }

    public void eliminaProdottoByCodice(String codice) {
        prodotti.rimuoviByCodice(codice);
    }

    public double calcolaCostoTotale() {
        return prodotti.calcolaCostoTotale();
    }

    public void stampaSpesa() {
        prodotti.stampa();
    }

    public void salvaSpesaSuFile(String nomeFile) {
        prodotti.salvaSuFile(nomeFile);
    }
}