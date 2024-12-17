package com.groupeisi;

public class Factoriel {
    public  int factoriel(int nombre) {
        int facto = 1;
        for (int i = 1; i <= nombre; i++) {
            facto *= i;
        }
        return facto;
    }
}
