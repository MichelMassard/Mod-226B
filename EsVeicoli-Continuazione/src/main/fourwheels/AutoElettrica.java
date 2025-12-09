package main.fourwheels;

import main.interfaces.VeicoloElettrico;

import java.math.BigDecimal;

public class AutoElettrica extends Auto implements VeicoloElettrico {

    private double autonomiaBatteria;

    public AutoElettrica(String targa, String marca, String modello, int numeroPosti, int numeroPorte) {
        super(targa, marca, modello, numeroPosti, numeroPorte);
        this.autonomiaBatteria = 100;
    }

    @Override
    public double getAutonomiaBatteria() {
        return autonomiaBatteria;
    }

    @Override
    public void ricarica() {
        System.out.println("Ricaricando la batteria...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        autonomiaBatteria = 100.0;
        System.out.println("Batteria completamente carica!");
    }
}
