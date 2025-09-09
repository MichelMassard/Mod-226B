/**
 * Autore: Liam Panarisi
 * Data creazione: 04.09.2025
 * Data utlima modifica: 08.09.2025
 * Titolo Progetto: Veicolo
 * Titolo classe: Veicolo
 */
package main;

import mechanics.Motore;
import java.util.Objects;

public class Veicolo {
    private String targa;
    private String marca;
    private final String modello;
    private int numeroPosti;
    private Motore motore;

    public Veicolo(String targa, String marca, String modello, int numeroPosti){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numeroPosti = numeroPosti;
    }
    // Metodo caratterizzante
    public void faiRumore() {
        System.out.println("Wruuuum");
    }

    // Getter & Setter
    public String getTarga() { return targa; }
    public void setTarga(String targa) { this.targa = targa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModello() { return modello; }

    public int getNumeroPosti() { return numeroPosti; }
    public void setNumeroPosti(int numeroPosti) { this.numeroPosti = numeroPosti; }

    public Motore getMotore() { return motore; }
    public void setMotore(Motore motore) { this.motore = motore; }

    // Equals & HashCode basati su marca e modello (case insensitive)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veicolo)) return false;
        Veicolo veicolo = (Veicolo) o;
        return modello.equalsIgnoreCase(veicolo.modello) &&
                marca.equalsIgnoreCase(veicolo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca.toLowerCase(), modello.toLowerCase());
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", numeroPosti=" + numeroPosti +
                ", motore=" + motore +
                '}';
    }
}

