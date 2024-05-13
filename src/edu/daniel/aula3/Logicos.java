package edu.daniel.aula3;

public class Logicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        if (a && b){
            System.out.println("Verdade");
        }else {
            System.out.println("Falso");
        }
        if (a || c){
            System.out.println("Verdade");
        }else {
            System.out.println("Falso");
        }
        if (a && c){
            System.out.println("Verdade");
        }else {
            System.out.println("Falso");
        }
    }
}
