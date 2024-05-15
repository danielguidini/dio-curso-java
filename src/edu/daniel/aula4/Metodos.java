package edu.daniel.aula4;

public class Metodos {
    public static void main(String[] args) {
        SmartTV tvsala = new SmartTV();
        tvsala.ligar();
        tvsala.mudarCanal(30);
        tvsala.aumentarVolume();
        tvsala.aumentarVolume();
        tvsala.aumentarCanal();


        System.out.println("A tv esta ligada? "+ tvsala.estado);
        System.out.println("O volume e: "+ tvsala.volume);
        System.out.println("O canal e: "+ tvsala.canal);

    }
}
