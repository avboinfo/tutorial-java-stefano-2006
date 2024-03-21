public class Videogame{
    int anno_pub;
    float costo;
    String nome, marca;
    public Videogame(String nome, String marca, float costo, int anno_pub){
        this.costo = costo;
        this.anno_pub = anno_pub;
        this.nome = nome;
        this.marca = marca;
    }
    public String toString(){
        return "nome e marca:" + nome + marca + costo + anno_pub;
    }
}