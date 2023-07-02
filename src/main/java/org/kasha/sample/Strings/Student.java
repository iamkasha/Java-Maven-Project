package Strings;

public class Student implements Comparable<Student>{
    public String firstName;
    public String lastName;
    public float gpa;

    public Student(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }


    public int compareTo(Student other){
        return this.lastName.compareTo(other.lastName);
    }

    public String toString(){
        return this.lastName + " " + this.firstName + " " + this.gpa;
    }

}
