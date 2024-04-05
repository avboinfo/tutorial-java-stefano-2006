package ProntoSoccorso;

public class Paziente {
    String nome, cognome, trage;

    public Paziente(String nome, String cognome, String trage) {
        this.nome = nome;
        this.cognome = cognome;
        this.trage = trage;
    }

    public String getTrage() { //SOLO IL TRIAGE PERCHè è L'UNICO CHE SI PUò CAMBIARE
        return trage;
    }

    public void setTrage(String trage) {
        this.trage = trage;
    }

    @Override
    public String toString() {
        return "Paziente [nome=" + nome + ", cognome=" + cognome + ", trage=" + trage + "]";
    }
    
}
