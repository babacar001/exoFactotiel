package com.groupeisi;

import java.util.Scanner;

public abstract class Main {


    public static void main(String[] args) {
        Factoriel f = new Factoriel();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ecrire un nombre");
        int  nombre = sc.nextInt();
        System.out.println("Le factoriel de " + nombre + " est " + f.factoriel(nombre));

    }


}
