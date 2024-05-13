package edu.daniel.aula1;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 5) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 5) {
            System.out.println("Aprovado rsrs");
        } else {
            System.out.println("Parabens");
        }
    }
}
