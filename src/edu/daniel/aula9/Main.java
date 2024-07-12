package edu.daniel.aula9;

public class Main {
    public static void main(String args[]){
        Pessoa id101 = new Pessoa("daniel", "17417509622", 21);
        id101.setEndereco("Rua Principal");

        System.out.println(id101.getNome());
        System.out.println(id101.getCpf());
        System.out.println(id101.getIdade());
        System.out.println(id101.getEndereco());
    }
}
