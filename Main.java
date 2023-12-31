abstract class Marks {
    abstract double getPercentage();
}

class Student1 extends Marks {
    private int subject1, subject2, subject3;

    Student1(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class Student2 extends Marks {
    private int subject1, subject2, subject3, subject4;

    Student2(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1(56, 90, 85);
        System.out.println("Percentage of Student1: " + student1.getPercentage() + "%");

        Student2 student2 = new Student2(85, 62, 98, 98);
        System.out.println("Percentage of Student2: " + student2.getPercentage() + "%");
    }
}

