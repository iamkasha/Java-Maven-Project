package org.kasha.sample.HashMaps;
public class HashStudent {
        String firstName;
        String lastName;

        float gpa;

        public HashStudent(String firstName, String lastName, float gpa) {
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

        @Override
        public String toString() {
            return "Student: " + firstName + " " + lastName + ", GPA: " + gpa;
        }
}

