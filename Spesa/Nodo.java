package Spesa;

public class Nodo {
    Prodotto valore;
    Nodo successivo;

    public Nodo(Prodotto valore) {
        this.valore = valore;
        this.successivo = null;
    }

    public void setValore(Prodotto valore) {
        this.valore = valore;
    }

    public Prodotto getValore() {
        return valore;
    }

    public Nodo getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(Nodo successivo) {
        this.successivo = successivo;
    }
}
