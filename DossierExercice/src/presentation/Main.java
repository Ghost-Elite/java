package presentation;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Voiture = new ArrayList<String>();
        Voiture.add("Volvo");
        Voiture.add("BMW");
        Voiture.add("Ford");
        Voiture.add("Mazda");//permet d'additione
        Voiture.set(1, "Opel");//permet de remplacer
        Voiture.remove(0);//permet de supprimer
        //Voiture.clear();//permet d'effacer toute la liste
        Voiture.size();//permet d'avore la taille de la liste
        System.out.println("La liste des voitures");
//        for (String elm: Voiture) {
//            System.out.println(elm);
//        }
        for (int i = 0;i<Voiture.size();i++){
            System.out.println("la voiture de la marque " + Voiture.get(i));
        }
        HashMap<String,String>Capital = new HashMap<String,String>();
        Capital.put("Senegal" , "Dakar");
        Capital.put("France" , "Paris");
        Capital.put("England" , "London");
        Capital.put("Etats Unies","Washington");
        for (String elm: Capital.keySet()) {
            System.out.println(elm +" = " +Capital.get(elm));
        }


        //System.out.println("la voiture de la marque " +Voiture.get(3));
    }
}
