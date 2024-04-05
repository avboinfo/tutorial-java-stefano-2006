package ProntoSoccorso;

public class ProntoSoccorso {

    Lista<Paziente> ps;  // ps è una lista di pazienti

    public ProntoSoccorso(){
        ps = new Lista<>();
        loadFromFile();
    }
    private void loadFromFile(){
        ps.addTail(new Paziente("Mario","Rossi","white"));
        ps.addTail(new Paziente("Mario","Rossi","white"));
        ps.addTail(new Paziente("Mario","Rossi","white"));
        ps.addTail(new Paziente("Mario","Rossi","white"));

    }
}