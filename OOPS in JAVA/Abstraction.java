abstract class Animal { // Abstract is a concept which is exists but not accessed or used.
    abstract void walk(); // cannnot be used

    public void runs() {
        System.out.println("Runs on four feets");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on four shoes");
    }
}

class Dog extends Animal {
    public void walk() {
        System.out.println("Walks on four paws");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.runs(); // Inherited from Animal class

        Dog d1 = new Dog();
        d1.walk();
        d1.runs(); // Inherited from Animal class

        // Animal a1 = new Animal(); // Cannot be instantiated ( Shows Run type Errors)

    }
}
