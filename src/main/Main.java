package main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String [] mojNiz = {"Pera", "Zika", "Laza"};
        mojNiz[0] = "Marko";
        mojNiz[1] = "John";
        mojNiz[2] = "Djordje";

        for (String s:mojNiz) {//has next
            System.out.println(s);
        }

        System.out.println("Ispis new branch - old code!");

        System.out.println("Ispis sa branch-a add-new-tests");

        System.out.println("Ispis new branch - old code!");

    }

}
