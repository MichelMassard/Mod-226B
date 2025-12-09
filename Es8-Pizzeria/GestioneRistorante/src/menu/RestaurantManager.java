package menu;

import menu.Pizza;
import menu.Pasta;
import menu.Dessert;
import java.util.*;

public class RestaurantManager {
    private HashMap<String, MenuItem> menu = new HashMap<>();
    private HashSet<String> clientiUnici = new HashSet<>();
    private ArrayList<Order> ordini = new ArrayList<>();
    private HashMap<String, Integer> piattiOrdinati = new HashMap<>();

    public void aggiungiPiattoAlMenu(MenuItem item) {
        if (item instanceof Pizza) {
            menu.put(((Pizza)item).getName(), item);
        } else if (item instanceof Pasta) {
            menu.put(((Pasta)item).getName(), item);
        } else if (item instanceof Dessert) {
            menu.put(((Dessert)item).getName(), item);
        }
    }

    public void stampaMenu() {
        System.out.println("=============== MENU DEL RISTORANTE ===============\n");
        for (MenuItem item : menu.values()) {
            String nome = "";
            if (item instanceof Pizza) nome = ((Pizza)item).getName();
            else if (item instanceof Pasta) nome = ((Pasta)item).getName();
            else if (item instanceof Dessert) nome = ((Dessert)item).getName();
            System.out.println(nome.toUpperCase());
            System.out.println("  " + item.getDescription());
            System.out.printf("  Prezzo: €%.2f\n", item.calculatePrice());
            System.out.println("  Tempo preparazione: " + item.getPreparationTime() + " min\n");
        }
    }

    public void registraOrdine(String cliente, String nomePiatto) {
        MenuItem item = menu.get(nomePiatto);
        if (item != null) {
            ordini.add(new Order(cliente, nomePiatto, item));
            clientiUnici.add(cliente);
            piattiOrdinati.put(nomePiatto, piattiOrdinati.getOrDefault(nomePiatto, 0) + 1);
            System.out.println("Ordine registrato: " + cliente + " - " + nomePiatto);
        }
    }

    public void stampaStatisticheGiornaliere() {
        System.out.println("\n========== STATISTICHE GIORNALIERE ==========");
        System.out.println("Clienti unici oggi: " + clientiUnici.size() + "\n");
        System.out.println("Clienti:");
        ArrayList<String> clienti = new ArrayList<>(clientiUnici);
        Collections.sort(clienti);
        for (String c : clienti) {
            System.out.println("  - " + c);
        }
        String piattoPopolare = "";
        int maxOrdini = 0;
        for (Map.Entry<String, Integer> entry : piattiOrdinati.entrySet()) {
            if (entry.getValue() > maxOrdini) {
                maxOrdini = entry.getValue();
                piattoPopolare = entry.getKey();
            }
        }
        System.out.println("\nPiatto più popolare: " + piattoPopolare + " (" + maxOrdini + " ordini)");
        double tempoTotale = 0;
        for (Order o : ordini) {
            tempoTotale += o.item.getPreparationTime();
        }
        double tempoMedio = ordini.size() > 0 ? tempoTotale / ordini.size() : 0;
        System.out.printf("Tempo medio di preparazione: %.2f minuti\n", tempoMedio);
        System.out.println("==========================\n");
    }

    public double calcolaIncassoGiornaliero() {
        double totale = 0;
        for (Order o : ordini) {
            totale += o.item.calculatePrice();
        }
        return totale;
    }

    private static class Order {
        String cliente;
        String nomePiatto;
        MenuItem item;
        Order(String cliente, String nomePiatto, MenuItem item) {
            this.cliente = cliente;
            this.nomePiatto = nomePiatto;
            this.item = item;
        }
    }
}
