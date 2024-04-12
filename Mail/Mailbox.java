package Mail;

import java.util.ArrayList;

public class Mailbox {
    String mittente, oggetto, testo;
    int data, ora;

    public Mailbox(String mittente,String oggetto,String testo, int ora, int data){
        this.mittente =  mittente;
        this.oggetto =  oggetto;
        this.testo =  testo;
        this.data =  data;
        this.ora =  ora;
    }

    ArrayList<String> mail = new ArrayList<String>();


}
