/**
 * Autore: Liam Panarisi
 * Data creazione: 04.09.2025
 * Data utlima modifica: 08.09.2025
 * Titolo Progetto: Veicolo
 * Titolo classe: Moto
 */
package main.twowheels;

import main.Veicolo;

public final class Moto extends Veicolo {
    private String tipo;

    public Moto(String targa, String marca, String modello, int numeroPosti, String tipo) {
        super(targa, marca, modello, numeroPosti);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public void faiRumore() {
        System.out.println("Braaap Braaap!");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "targa='" + getTarga() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                ", numeroPosti=" + getNumeroPosti() +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
