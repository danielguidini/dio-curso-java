package edu.daniel.aula3;

public class Ternario {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        if(a == b){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
        //  pode ser substituido por
        String resultado;
        resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        boolean simNao = a == b;
        System.out.println(simNao);
    }
}
