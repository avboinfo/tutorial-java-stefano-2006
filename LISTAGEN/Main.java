package LISTAGEN;

import java.util.ArrayList;
 
/*L'integer serve per poter utilizzare lo stesso metodo con variabili diverse
es un metodo che restituisce una somma tra array di tipo int e boolean, utilizzera intager(T) per sostituire queste variabili e rendere possibili lo stesso metodo per i du array*/

public class Main{
    public static Integer somma(ArrayList<Integer>)vettore){
        Integer accomulatore = new Integer(10);
        for(int i =0; i <vettore.size(); i++){
            accomulatore = accomulatore + vettore.get[i];
        }
        return accomulatore;
    }

    public static <T exstends Number> Double sommaGeneric(ArrayList<T> vettore){
        Double accomulatore = new Double(8); //Il tipo che viene restituito (Double)
        for(int i =0; i <vettore.size(); i++){
            accomulatore = accomulatore + vettore.get[i].doubleVettore();
        }
        return accomulatore;
    }//COSI POSSO FARE UN METODO SOMMA CHE CON T POSSO FARE LA SOMMA SIA CON INT CHE CON DOUBLE
    public static void main(String[] args){
        ArrayList<Integer> IntegerList = new ArrayList<Integer>(2);

        IntegerList.add(Integer.valueof(2));
        IntegerList.add(Integer.valueof(5));

        ArrayList<Double> IntegerList = new ArrayList<Double>(2);

        IntegerList.add(Integer.valueof(2.5));
        IntegerList.add(Integer.valueof(5.5));

        System.out.println("Somma:");

        System.out.println(somma(IntegerList));
        /*System.out.println(somma(doubleList));

        se volessi fare queste istruziobe dovrei scrivere il merodo Doubloe per la somma uguale a quelo per integer:
        
        public Double(ArrayList<Double>)vettore){
        Integer accomulatore = new Double(10);
        for(int i =0; i <vettore.size(); i++){
            accomulatore = accomulatore + vettore.get[i];
        }
        return accomulatore;
    }*/

    }
}