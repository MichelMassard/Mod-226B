package menu;

import menu.Pizza;
import menu.Pasta;
import menu.Dessert;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        // Pizze
        ArrayList<String> margheritaToppings = new ArrayList<>();
        margheritaToppings.add("mozzarella");
        margheritaToppings.add("pomodoro");
        margheritaToppings.add("basilico");
        manager.aggiungiPiattoAlMenu(new Pizza("Margherita", 9.0, margheritaToppings));

        ArrayList<String> quattroStagioniToppings = new ArrayList<>();
        quattroStagioniToppings.add("mozzarella");
        quattroStagioniToppings.add("prosciutto");
        quattroStagioniToppings.add("funghi");
        quattroStagioniToppings.add("carciofi");
        quattroStagioniToppings.add("olive");
        manager.aggiungiPiattoAlMenu(new Pizza("Quattro Stagioni", 12.0, quattroStagioniToppings));

        // Dessert
        manager.aggiungiPiattoAlMenu(new Dessert("Tiramisù", 5.0, false));
        manager.aggiungiPiattoAlMenu(new Dessert("Panna Cotta", 5.0, true));

        // Pasta
        manager.aggiungiPiattoAlMenu(new Pasta("Arrabbiata", 9.0, true));
        manager.aggiungiPiattoAlMenu(new Pasta("Carbonara", 9.0, false));

        manager.stampaMenu();

        System.out.println("========== REGISTRAZIONE ORDINI ==========");
        manager.registraOrdine("Mario Rossi", "Margherita");
        manager.registraOrdine("Luca Bianchi", "Carbonara");
        manager.registraOrdine("Anna Verdi", "Quattro Stagioni");
        manager.registraOrdine("Giovanni Neri", "Tiramisù");
        manager.registraOrdine("Andrea Viola", "Margherita");
        manager.registraOrdine("Sofia Arancio", "Carbonara");
        manager.registraOrdine("Matteo Verde", "Quattro Stagioni");
        manager.registraOrdine("Mario Rossi", "Carbonara");

        manager.stampaStatisticheGiornaliere();

        double incasso = manager.calcolaIncassoGiornaliero();
        System.out.printf("FATTURATO TOTALE: €%.2f\n", incasso);
    }
}
