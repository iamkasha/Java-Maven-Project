package Collectionss;

import java.util.ArrayList;

public class StudentList {

    public static void main(String[] args) {

        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("Sachin", "Tendulkar", 4.0F));
        st.add(new Student("MS", "Dhoni", 3.9F));
        st.add(new Student("Virat", "Kohli", 3.8F));
        st.add(new Student("Rohit", "Sharma", 3.5F));
        st.add(new Student("Dinesh", "Karthik", 2.2F));
        st.add(new Student("Mohammad", "Siraj", 2.9F));
        st.add(new Student("Jasprit", "Bumrah", 1.5F));

        double sum = 0;
        for(Student s: st){
            sum = (sum + s.getGpa());
        }

        double avg_gpa = sum/ st.size();
        System.out.println("Average gpa: " + avg_gpa);

        st.stream()
                .filter(s -> s.getGpa() > avg_gpa)
                .forEach(stu -> System.out.println(stu.getFirstName() + " " + stu.getLastName() + " " + stu.getGpa()));

    }

}
