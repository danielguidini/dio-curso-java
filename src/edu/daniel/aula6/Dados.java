package edu.daniel.aula6;

import java.util.Scanner;
import java.util.Locale;

public class Dados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        System.out.println("////////////////////////////////////////////////////////////");
        System.out.println("Seu nome e " + nome + " " + sobrenome);
        System.out.println("Sua altura e " + idade + " anos");
        System.out.println("Sua altura e " + altura + "cm");

        scanner.close();
    }
}
