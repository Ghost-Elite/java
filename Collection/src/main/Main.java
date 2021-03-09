package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        final Map<MonTest,String> map = new HashMap<MonTest,String>();

        System.out.println("debut");
        for (int j = 0;j < 10 ;j++){
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1 ; i <= 100000;i++){
                        map.put(new MonTest(i),"element" +i);
                    }
                }
            },"Thread 0" +j);
            t1.start();
        }
        for (int j = 0; j < 10 ; j++){
            Thread t2 = new  Thread((new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i <= 10000; i++){
                        map.get(i);
                    }
                }
            }),"Thread 1" +j);
            t2.start();
        }


        /*  Hashtable<Integer,String> numbers = new Hashtable<Integer,String>();
        numbers.put(1,"elm1");
        numbers.put(2,"elm2");
        numbers.put(3,"elm3");
        numbers.put(4,"elm4");
        numbers.put(5,"elm5");
        String n = numbers.get(2);
        if(n != null){
            System.out.println("2 = " + n);
        }*/











        /*String[] tableau = {"A","B","C","D"};
        List<String> liste = new ArrayList<String>();
        System.out.println("Contenu du tableau ");
        for (String str : tableau){
            System.out.println("" + str);
        }
        liste = Arrays.asList(tableau);
        System.out.println("\nContenu de la liste");
        for (String str : liste){
            System.out.println(" "+ str);
        }
        System.out.println("\n");
        tableau[0] ="A";
        System.out.println("\nContenu de la liste");
        for (String str : liste){
            System.out.println(" " +str);
        }
        liste.add("E");
        System.out.println("\nContenu du tableau");
        for (String str : tableau){
            System.out.println(" " +str);
        }*/
    }

}
