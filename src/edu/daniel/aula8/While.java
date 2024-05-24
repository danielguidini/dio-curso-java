package edu.daniel.aula8;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        float dinheiro = 50.0F;
        while (dinheiro > 0) {
            float compras = (float) comprasNoMercado();
            if (dinheiro < compras) {
                break;
            }
            dinheiro -= compras;
            System.out.println(compras + " Valor Debitado");
            System.out.println("Saldo " + dinheiro);
        }
        System.out.println("Compras Realizadas");

    }


    private static double comprasNoMercado() {
        return ThreadLocalRandom.current().nextFloat(2, 8);
    }
}
