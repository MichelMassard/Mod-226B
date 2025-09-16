package main;

import main.fourwheels.Auto;
import main.fourwheels.AutoElettrica;
import main.twowheels.Moto;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Auto miaAuto = new Auto("AA111BB", "Fiat", "Panda", 5, 3);
        Moto miaMoto = new Moto("CC222DD", "Honda", "CBR600", 2, "Sport");

        BigDecimal costoRiparazioneAuto = miaAuto.calcolaCostoRiparazione(5);
        System.out.println("Costo riparazione auto: " + costoRiparazioneAuto);

        BigDecimal costoAssicurazioneMoto = miaMoto.getCostoAssicurazione();
        System.out.println("Costo assicurazione moto: " + costoAssicurazioneMoto);

        main.interfaces.Riparabile rip;
        main.interfaces.Assicurabile ass;

        rip = miaAuto;
        System.out.println("Costo riparazione da variabile Riparabile: " + rip.calcolaCostoRiparazione(3));

        ass = miaMoto;
        System.out.println("Costo assicurazione da variabile Assicurabile: " + ass.getCostoAssicurazione());

        AutoElettrica miaAutoElettrica = new AutoElettrica("EE333FF", "Tesla", "Model 3", 5, 4);
        System.out.println("Autonomia batteria prima ricarica: " + miaAutoElettrica.getAutonomiaBatteria() + "%");
        miaAutoElettrica.ricarica();
        System.out.println("Autonomia batteria dopo ricarica: " + miaAutoElettrica.getAutonomiaBatteria() + "%");
    }
}
