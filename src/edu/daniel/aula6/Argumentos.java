package edu.daniel.aula6;

public class Argumentos {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Seu nome e "+nome+" "+sobrenome);
        System.out.println("Sua altura e "+idade+" anos");
        System.out.println("Sua altura e "+altura+"cm");
    }
}
