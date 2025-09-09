/**
 * Autore: Liam Panarisi
 * Data creazione: 04.09.2025
 * Data utlima modifica: 08.09.2025
 * Titolo Progetto: Veicolo
 * Titolo classe: Main
 */
import main.fourwheels.Camion;
import main.twowheels.Moto;
import mechanics.Motore;

public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("RONDO67", "MAYBACH", "Camione", 2, 90909);
        Moto moto = new Moto("YZ99YZ", "Yamaha", "YZ", 1, "MOTARD  ");

        // Set motore per la moto
        moto.setMotore(new Motore("MOT12345", "CrossEngine"));

        System.out.print("Il camion fa: ");
        camion.faiRumore();

        System.out.print("La moto fa: ");
        moto.faiRumore();

        // Stampa dettagli
        System.out.println(camion);
        System.out.println(moto);
    }
}
