package edu.daniel.aula10;

public class Main {
    public static void main(String[] args) {
        for(EstadoBrasileiro a: EstadoBrasileiro.values()){
            System.out.println(a.getNome()+" "+a.getSigla());
        }
    }
}
