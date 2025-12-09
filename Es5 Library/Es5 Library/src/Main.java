import model.*;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Purchasable> library = new HashSet<>();

        EBook ebook = new EBook("001", "Java Programming", "Mario Rossi", 25.0, Genre.TECHNOLOGY, 320, true);
        AudioBook audiobook = new AudioBook("002", "Learn Java", "Luca Bianchi", 30.0, "Anna Narrator", 540, "Italian"); // 9h
        DigitalMagazine magazine = new DigitalMagazine("003", "Tech Monthly", "Tech Team", 8.0, 12, LocalDate.now().minusDays(20), "Technology");
        OnlineCourse course = new OnlineCourse("004", "Master Java", "Giulia Verdi", 120.0, "Prof. Giulia", Difficulty.ADVANCED, 12);

        // Inserisco oggetti nel Set, incluso duplicato
        library.add(ebook);
        library.add(audiobook);
        library.add(magazine);
        library.add(course);
        library.add(ebook); // duplicato

        System.out.println("Numero oggetti nel set (dovrebbe essere 4): " + library.size());

        for (Purchasable item : library) {
            DigitalContent content = (DigitalContent) item;
            System.out.println("Tipo contenuto: " + content.getContentType());
            System.out.println("Descrizione: " + content.getDescription());

            // calculatePrice() - polimorfo in AudioBook e DigitalMagazine
            System.out.println("calculatePrice(): " + item.calculatePrice() + " (polimorfo/ereditato)");

            // applyDiscount
            item.applyDiscount(10);
            System.out.println("applyDiscount(10%) chiamato (ereditato)");

            // getPriceWithTax - metodo di default dell'interfaccia
            System.out.println("getPriceWithTax(): " + item.getPriceWithTax() + " (default interface method)");

            // Metodi specifici
            if (content instanceof EBook e) {
                System.out.println("getReadingTime(): " + e.getReadingTime() + " (specifico EBook)");
            } else if (content instanceof AudioBook a) {
                System.out.println("getFormattedDuration(): " + a.getFormattedDuration() + " (specifico AudioBook)");
            } else if (content instanceof DigitalMagazine m) {
                System.out.println("isRecentIssue(): " + m.isRecentIssue() + " (specifico DigitalMagazine)");
            } else if (content instanceof OnlineCourse c) {
                System.out.println("getCertificationEligible(): " + c.getCertificationEligible() + " (specifico OnlineCourse)");
            }

            System.out.println("-------------------------------------------------");
        }
    }
}
