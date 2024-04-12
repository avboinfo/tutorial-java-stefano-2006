package ProntoSoccorso;

public class Lista<T> {

    Nodo<T> root;

    public Lista() {
        this.root = null;
    }

    public boolean isEmpty(){
        return root==null;
    }
    publicvoid addHead( T v){
        Nodo<T> n = new Nodo<>( v );

    }

    public void addTail(T v ) {
        Nodo<T> n = new Nodo<>( v );
        if (root==null) {
            root = n;
        }else {
            Nodo<T> tmp = root;
            while (tmp.getSuccessivo()!=null) tmp=tmp.getSuccessivo();
            tmp.setSuccessivo( n );
        }
    }

    public void addSorted(Nodo n){
        Nodo<T> n = new Nodo<>( v );

        if(isEmpty()){ root = n; n.setSuccessivo(null); return;}
        int vn = n.getValore();
        if(vn<radice.getValore()){ n.setSuccessivo(radice); radice=n; return;}
        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();
        while(p2 != null && vn>p2.getValore() ){
            p1 = p2;
            p2 = p1.getSuccessivo();
        }    
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
    }

    public boolean addAfter( int pos,Nodo n){ 
        //aggiunge il nodo n dopo aver oltrepassato il nodo di indice pos
        Iteratore iter = this.getIterator();
        int i; Nodo npos=null;
        for(i=0;i<pos;i++){
            if(iter.hasNext()) npos = iter.next();
            else return false;
        }
        n.setSuccessivo(npos.getSuccessivo());
        npos.setSuccessivo(n);
        return true;
    }
    
    public String toString() {
        String s = "\nLIST BEGIN *************\n";
        Nodo<T> tmp = root;
        while (tmp!=null) {
            s += tmp + "\n";
            tmp=tmp.getSuccessivo();
        }
        s += "********************* LIST END\n";
        return s;
    }


}