package edu.daniel.aula4;

public class SmartTV{
    boolean estado = false;
    int canal = 2;
    int volume = 0;

    public void ligar(){
        estado = true;
    }
    public void desligar(){
        estado = false;
    }
    public void mudarCanal(int canal) {
        this.canal = canal;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
