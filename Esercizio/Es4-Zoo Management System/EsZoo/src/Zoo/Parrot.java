package Zoo;

public class Parrot extends Animal implements Feedable {

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Squawk";
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " the Parrot is eating " + food);
    }
}

