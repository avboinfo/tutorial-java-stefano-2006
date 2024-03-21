import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;



public class Raccolta {

ArrayList<Videogame> lista;


    public Raccolta(String file){
        File f = new File(file);

        try{
            Scanner fileInput = new Scanner(f);
            while(fileInput.hasNextLine()){
                    String line = fileInput.nextLine();
                    String[] field=line.split(";");
                    lista.add(new Videogame(field[0],field[1],Float.parseFloat(field[2]),Integer.parseInt(field[3])));
            }
            fileInput.close();
        }catch (Exception e){
                System.out.println("Errore");
    }
}
public String toString(){
    
}
}
