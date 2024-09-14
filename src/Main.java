// Main.java
public class Main {

    public static void runParentExample() {
        Parent obj1 = new FirstSubclass();
        obj1.message();

        Parent obj2 = new SecondSubclass();
        obj2.message();
    }

    public static void runBankExample() {
        Bank bankA = new BankA();
        System.out.println("Balance in Bank A: $" + bankA.getBalance());

        Bank bankB = new BankB();
        System.out.println("Balance in Bank B: $" + bankB.getBalance());

        Bank bankC = new BankC();
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }

    public static void runMarksExample() {
        A studentA = new A(85, 90, 80);
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");

        B studentB = new B(75, 85, 90, 88);
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }

    public static void runAbstractClassExample() {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.normalMethod();
    }

    public static void runAnimalExample() {
        Animal cat = new Cat();
        cat.cats();

        Animal dog = new Dog();
        dog.dogs();
    }

    public static void runShapeExample() {
        Area area = new Area();

        System.out.println("Area of Rectangle: " + area.RectangleArea(5, 3));
        System.out.println("Area of Square: " + area.SquareArea(4));
        System.out.println("Area of Circle: " + area.CircleArea(3));
    }

    public static void main(String[] args) {
        System.out.println("Running Parent Example:");
        runParentExample();

        System.out.println("\nRunning Bank Example:");
        runBankExample();

        System.out.println("\nRunning Marks Example:");
        runMarksExample();

        System.out.println("\nRunning Abstract Class Example:");
        runAbstractClassExample();

        System.out.println("\nRunning Animal Example:");
        runAnimalExample();

        System.out.println("\nRunning Shape Example:");
        runShapeExample();
    }
}