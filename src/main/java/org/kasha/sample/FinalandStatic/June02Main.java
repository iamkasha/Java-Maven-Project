package org.kasha.sample.FinalandStatic;

public class June02Main {
    public static void main(String[] args) {
        TeamIndia team = new TeamIndia();
        team.test_squad();
        team.odi_squad();

        ConstructorChild  cp = new ConstructorChild(18, 30);
        ConstructorChild child2 = new ConstructorChild(15);
        System.out.println("parent age is: " + cp.parentAge + ", child age is: " + cp.childAge);
        //System.out.println("child age is:" + child2.childAge + "parent of child2 age is:" + child2.parentAge);
        System.out.println("child age is: " + child2.childAge);

        System.out.println("Age from static is: " + StaticClass.displayAge(21));

        // Final class
        myFinalClass f1 = new myFinalClass();
        f1.displayFamily();
    }
}
