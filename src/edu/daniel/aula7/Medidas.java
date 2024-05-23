package edu.daniel.aula7;

public class Medidas {
    public static void main(String[] args) {
        String tamanho = "G";
        switch (tamanho){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("Indefinido");
            }
        }
    }
}
