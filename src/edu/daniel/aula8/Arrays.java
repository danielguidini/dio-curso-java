package edu.daniel.aula8;

public class Arrays {
    public static void main(String[] args) {
        String nomes[] = {"DANIEL", "JOAO", "MELINA"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
