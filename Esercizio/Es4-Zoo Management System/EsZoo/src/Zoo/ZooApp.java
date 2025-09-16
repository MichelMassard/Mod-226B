package Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooApp {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Simba", 5, true));
        animals.add(new Lion("Nala", 4, true));
        animals.add(new Elephant("Dumbo", 10, false));
        animals.add(new Elephant("Ella", 12, false));
        animals.add(new Parrot("Polly", 2));
        animals.add(new Parrot("Rio", 3));

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("Sound: " + animal.makeSound());

            if (animal instanceof Feedable feedableAnimal) {
                String food = switch (animal.getClass().getSimpleName()) {
                    case "Lion" -> "meat";
                    case "Elephant" -> "fruits";
                    case "Parrot" -> "seeds";
                    default -> "food";
                };
                feedableAnimal.eat(food);
            }

            System.out.println();
        }
    }
}
