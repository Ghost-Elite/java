package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void afficherList(final String nom ,final List<String> list1){
        int i =0 ;
        for (String elm : list1){
            System.out.format("%s %2d : %s\n",nom,i,elm);
            i++;
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        List<String>list1 = list.subList(1,4);
        afficherList("sous liste ",list1);
    }
}
