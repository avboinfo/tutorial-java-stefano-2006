
public class Main {
    public static void main(String[] args) {

        ContoBancario contoDiGiulietta = new ContoBancario("Giulietta", 0);
        ContoBancario contoDiRomeo = new ContoBancario("Romeo", 0);
        contoDiGiulietta.versa(2000);
        contoDiGiulietta.prelievo(500);
        contoDiGiulietta.prelievo(400);
        contoDiGiulietta.bonifico(200, contoDiRomeo);

        contoDiRomeo.calcoloInteressi(10);

        System.out.println(contoDiRomeo);
        System.out.println(contoDiGiulietta);

    }
}
