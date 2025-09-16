package main.fourwheels;

import main.Veicolo;

public class Camion extends Veicolo {
    private int capacitaMassimaCarico;

    public Camion(String targa, String marca, String modello, int numeroPosti, int capacitaMassimaCarico) {
        super(targa, marca, modello, numeroPosti);
        this.capacitaMassimaCarico = capacitaMassimaCarico;
    }

    public int getCapacitaMassimaCarico() {
        return capacitaMassimaCarico;
    }

    public void setCapacitaMassimaCarico(int capacitaMassimaCarico) {
        this.capacitaMassimaCarico = capacitaMassimaCarico;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacitaMassimaCarico=" + capacitaMassimaCarico +
                ", " + super.toString() +
                '}';
    }
}
