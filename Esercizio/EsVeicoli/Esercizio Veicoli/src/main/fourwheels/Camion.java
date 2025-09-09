/**
 * Autore: Michel Massard
 * Titolo Progetto: Veicolo
 * Titolo classe: Camion
 */
package main.fourwheels;

import main.Veicolo;

public class Camion extends Veicolo {
    private double capacitaMassimaCarico;

    public Camion(String targa, String marca, String modello, int numeroPosti, double capacitaMassimaCarico) {
        super(targa, marca, modello, numeroPosti);
        this.capacitaMassimaCarico = capacitaMassimaCarico;
    }

    public double getCapacitaMassimaCarico() { return capacitaMassimaCarico; }
    public void setCapacitaMassimaCarico(double capacitaMassimaCarico) { this.capacitaMassimaCarico = capacitaMassimaCarico; }

    @Override
    public String toString() {
        return "Camion{" +
                "targa='" + getTarga() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                ", numeroPosti=" + getNumeroPosti() +
                ", capacitaMassimaCarico=" + capacitaMassimaCarico +
                '}';
    }
}
