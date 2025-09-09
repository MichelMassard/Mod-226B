/**
 * Autore: Michel Massard
 * Titolo Progetto: Veicolo
 * Titolo classe: Motore
 */
package mechanics;

public class Motore {
    private String numeroSerie;
    private String modello;

    public Motore(String numeroSerie, String modello) {
        this.numeroSerie = numeroSerie;
        this.modello = modello;
    }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public String getModello() { return modello; }
    public void setModello(String modello) { this.modello = modello; }

    @Override
    public String toString() {
        return "Motore{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
