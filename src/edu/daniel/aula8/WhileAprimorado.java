package edu.daniel.aula8;

import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class WhileAprimorado {

    public static void main(String[] args) {
        float dinheiro = 50.0F;
        DecimalFormat df = new DecimalFormat("0.00");

        while (dinheiro > 0) {
            float valorCompra = comprasNoMercado();

            if (dinheiro < valorCompra) {
                System.out.println("Saldo insuficiente para a compra: " + df.format(valorCompra));
                break;
            }

            dinheiro -= valorCompra;
            System.out.println(df.format(valorCompra) + " valor debitado");
            System.out.println("Saldo: " + df.format(dinheiro));
        }

        System.out.println("Compras finalizadas!");
    }

    private static float comprasNoMercado() {
        return ThreadLocalRandom.current().nextFloat(2, 8);
    }
}
