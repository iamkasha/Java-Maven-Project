package ReverseandFibonacci;

public class Person {
    public void ageGroup(int age){

        if(age >= 13 && age <= 19){
            System.out.println("The person is a teen");
        } else if(age < 13){
            System.out.println("The person is a kid");
        } else if(age > 19){
            System.out.println("The person is an adult");
        }
    }
}
