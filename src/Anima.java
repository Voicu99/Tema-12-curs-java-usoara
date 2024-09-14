// Animal.java
abstract class Animal {
    abstract void cats();
    abstract void dogs();
}

// Cat.java
class Cat extends Animal {
    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {
        // Not implemented
    }
}

// Dog.java
class Dog extends Animal {
    @Override
    void dogs() {
        System.out.println("Dogs bark");
    }

    @Override
    void cats() {
        // Not implemented
    }
}