package main.fourwheels;
import main.interfaces.Riparabile;
import main.Veicolo;

import java.math.BigDecimal;

public class Auto extends Veicolo implements Riparabile {
    private int numeroPorte;

    public Auto(String targa, String marca, String modello, int numeroPosti, int numeroPorte) {
        super(targa, marca, modello, numeroPosti);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }




    @Override
    public String toString() {
        return "Auto{" +
                "numeroPorte=" + numeroPorte +
                ", " + super.toString() +
                '}';
    }

    @Override
    public BigDecimal calcolaCostoRiparazione(int oreLavoro) {
        return BigDecimal.valueOf(oreLavoro * 45.0);
    }
}
