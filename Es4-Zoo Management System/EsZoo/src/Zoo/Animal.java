package Zoo;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [name=" + name + ", age=" + age + "]";
    }
}
