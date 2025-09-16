package service;

import main.interfaces.Riparabile;

import java.util.ArrayList;
import java.util.List;

public class Officina {
    private List<Riparabile> veicoliInRiparazione = new ArrayList<>();

    void accettaVeicoli(Riparabile veicolo) {
        veicoliInRiparazione.add(veicolo);
    }
    void stampaSchedarioRiparazione() {
        for (Riparabile r : veicoliInRiparazione) {
            System.out.println("Veicolo: " + r.toString());
            System.out.println("Costo riparazione stimato: " +
            r.calcolaCostoRiparazione(2));
            System.out.println("--------------------------------------------------------------");
        }
    }
}
