// Marks.java
abstract class Marks {
    abstract double getPercentage();
}

// A.java
class A extends Marks {
    private int marks1, marks2, marks3;

    A(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    @Override
    double getPercentage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }
}

// B.java
class B extends Marks {
    private int marks1, marks2, marks3, marks4;

    B(int marks1, int marks2, int marks3, int marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    @Override
    double getPercentage() {
        return (marks1 + marks2 + marks3 + marks4) / 4.0;
    }
}
