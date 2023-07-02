package FinalandStatic;

public class ConstructorChild extends ConstructorParent {

    int childAge;

    public ConstructorChild(int childAge, int parentAge){
        super();
        this.childAge = childAge;
        this.parentAge = parentAge;
    }

    public ConstructorChild(int childAge){
       this.childAge = childAge;
    }
}
