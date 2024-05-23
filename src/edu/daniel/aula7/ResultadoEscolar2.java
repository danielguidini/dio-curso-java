package edu.daniel.aula7;

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 5;
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }
}
