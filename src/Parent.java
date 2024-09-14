// Parent.java
abstract class Parent {
    abstract void message();
}

// FirstSubclass.java
class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

// SecondSubclass.java
class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}