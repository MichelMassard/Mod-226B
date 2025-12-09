package Zoo;

public class Elephant extends Mammal implements Feedable {

    public Elephant(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public String makeSound() {
        return "Trumpet";
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " the Elephant is eating " + food);
    }
}

