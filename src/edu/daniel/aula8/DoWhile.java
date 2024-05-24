package edu.daniel.aula8;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        do {
            System.out.println("Batendo na porta...");
        } while (abriuPorta());
        System.out.println("Quem Bate???");
    }

    private static boolean abriuPorta() {
        boolean resultado = new Random().nextInt(2) == 1;
        System.out.println("Abriu? " + resultado);
        return !resultado;

    }
}
