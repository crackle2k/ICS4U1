/*
Author: Dinesh Sinnathamby
Date: October 12th, 2026
Description: Reproduces the pet program's output using inheritance and polymorphism.
*/

public class Q3 {
    public static void main(String[] args) {
        Pet p = new Cat("Gus");
        p.feed();
        p.stroke();
        System.out.println(p);

        Fish f = new Fish("Bubbles");
        f.feed();
        f.feed();
        System.out.println(p);
        System.out.println(f);
    }
}

abstract class Pet {
    private String name;
    protected boolean alive = true;

    public Pet(String name) {
        this.name = name;
        System.out.print("New pet: " + name);
    }

    public abstract void feed();

    public void stroke() {
        System.out.println("mmm");
    }

    public String getStatus() {
        if (alive) {
            return "alive";
        } else {
            return "dead";
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
        System.out.println(" - a cat");
    }

    @Override
    public void feed() {
        System.out.println("meeow");
    }

    @Override
    public void stroke() {
        System.out.println("purr");
    }

    @Override
    public String toString() {
        return super.toString() + " is " + getStatus();
    }
}

class Fish extends Pet {
    private int timesFed;

    public Fish(String name) {
        super(name);
        timesFed = 0;
        System.out.println(" - a fish");
    }

    @Override
    public void feed() {
        System.out.println("bloop");
        timesFed++;
        if (timesFed > 1) {
            alive = false;
        }
    }

    @Override
    public void stroke() {
        System.out.println("purr");
    }

    @Override
    public String toString() {
        return super.toString() + " is " + getStatus();
    }
}
