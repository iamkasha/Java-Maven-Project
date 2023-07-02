package Collectionss;

public class Student {
    String firstName;
    String lastName;

    float gpa;

    public Student(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getGpa() {
        return gpa;
    }
}
