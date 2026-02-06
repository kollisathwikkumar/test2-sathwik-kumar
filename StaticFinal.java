package Test2;

class Student {
    private final int marksObtained;
    private String name;

    static String collegeName;
    static final int MAX_MARKS = 100;

    Student(String name, int marksObtained, String collegeName) {
        this.name = name;
        this.marksObtained = marksObtained;
        Student.collegeName = collegeName;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
        System.out.println("Marks Obtained: " + marksObtained);
        System.out.println("Max Marks: " + MAX_MARKS);

        double percentage = (marksObtained * 100.0) / MAX_MARKS;
        System.out.println("Percentage: " + percentage + "percentage");
    }
}

public class StaticFinal {
    public static void main(String[] args) {
        Student s1 = new Student("Sathwik", 65, "LPU");
        s1.printInfo();
    }
}
