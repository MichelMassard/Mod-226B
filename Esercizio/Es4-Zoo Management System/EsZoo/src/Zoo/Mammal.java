package Zoo;

public abstract class Mammal extends Animal {
    protected boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return super.toString() + ", hasFur=" + hasFur;
    }
}

