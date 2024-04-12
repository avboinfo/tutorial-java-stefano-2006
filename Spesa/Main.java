package Spesa;

public class Main {
    public static void main(String[] args) {
        Spesa spesa = new Spesa();

        // Aggiunta di alcuni prodotti alla spesa
        Prodotto p1 = new Prodotto("123456", "Pasta", 2.5);
        Prodotto p2 = new Prodotto("789012", "Latte", 1.2);
        Prodotto p3 = new Prodotto("345678", "Pane", 1.0);
        Prodotto p4 = new Prodotto("098636", "Biscotti", 7.0);

        spesa.aggiungiProdotto(p1);
        spesa.aggiungiProdotto(p2);
        spesa.aggiungiProdotto(p3);
        spesa.aggiungiProdotto(p4);


        System.out.println("Elenco dei prodotti nella spesa:");
        spesa.stampaSpesa();

        double costoTotale = spesa.calcolaCostoTotale();
        System.out.println("Costo totale della spesa: " + costoTotale);

        spesa.eliminaUltimoProdotto();
        System.out.println("Spesa dopo l'eliminazione dell'ultimo prodotto:");
        spesa.stampaSpesa();

        String codiceProdottoDaEliminare = "789012";
        spesa.eliminaProdottoByCodice(codiceProdottoDaEliminare);
        System.out.println("Spesa dopo l'eliminazione del prodotto con codice " + codiceProdottoDaEliminare + ":");
        spesa.stampaSpesa();

        spesa.salvaSpesaSuFile("spesa-spesa.txt");
        System.out.println("Spesa salvata su file 'spesa.txt'");
    }
}
