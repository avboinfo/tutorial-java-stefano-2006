import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

    public static void main( String[] args ) {

        File f = new File("provafile.csv");
        try {
            PrintWriter scrittore = new PrintWriter( f );
            Random random = new Random();           
            for (int i=0; i<10; i++ ) {
                float num1 = 
                scrittore.printf( "%05.2f\t%05.2f\n", Math.random()*100, Math.random()*100 );
            }
            scrittore.close();
        } catch (IOException e) {
            e.printStackTrace();
        }