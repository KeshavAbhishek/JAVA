// Student class definition
class Student {
    // Instance variables
    String name;
    int age;
    double grade;

    // Constructor to initialize the student object
    public Student(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

// Main class
public class studentDetails {
    public static void main(String[] args) {
        System.out.println("Student Details:\n");

        // Creating student objects
        // Edit these names
        Student student1 = new Student("Keshav", 20, 85.5);
        Student student2 = new Student("Ankit", 22, 92.0);

        // Displaying student details
        student1.displayDetails();
        student2.displayDetails();
    }
}