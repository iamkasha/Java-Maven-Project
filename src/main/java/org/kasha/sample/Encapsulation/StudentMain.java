package Encapsulation;

public class StudentMain {
    public static void main(String[] args){
        Student st = new Student();
        st.setName("Kasha");

        String my_name = st.getName();
        System.out.println(my_name);
    }
}

