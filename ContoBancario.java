import java.util.Scanner;

public class ContoBancario {
    private float conto;
    String nome;
    

    public ContoBancario(String nome, float conto) {
        this.conto = conto;
        this.nome = nome;
    }

    public float getConto() {
        return conto;
    }

    public void setConto(int conto) {
        this.conto = conto;
    }


    public float versa(int importo) {
        conto = conto + importo;
        return conto;
    }

    public float prelievo(int importo) {
        conto = conto - importo;
        if (importo > conto) {
            return 0;
        }
        return conto;
    }

    public float bonifico(int importo, ContoBancario destinatario) {
        conto = conto + importo;
        destinatario.versa(importo);
        if (importo > conto) {
            return 0;
        }
        return conto;
    }

    public float calcoloInteressi(float percentuale) {
        conto += (conto / 100) * percentuale;
        return conto;
    }

    String toString(float conto) {
        return "Il tuo conto residuo risale a:" + conto + "$";
    }

}