package edu.daniel.aula7;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 30.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;


        } else {
            System.out.println("Saldo Insuficiente");
        }
        System.out.println(saldo);

    }
}
