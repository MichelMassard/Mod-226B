package Zoo;

public class Lion extends Mammal implements Feedable {

    public Lion(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " the Lion is eating " + food);
    }
}

