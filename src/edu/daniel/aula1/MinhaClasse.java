package edu.daniel.aula1;

import org.jetbrains.annotations.NotNull;

public class MinhaClasse {
    public static void main(String[] args) {
        String meuNome = "Daniel";
        String meuSobrenome = "Guidini";
        final int anoNasc = 2002;
        System.out.println(nomeCompleto(meuNome, meuSobrenome).concat(" ").concat(Integer.toString(anoNasc)));
    }
    @org.jetbrains.annotations.NotNull
    public static String nomeCompleto(@NotNull String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
