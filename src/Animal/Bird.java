package Animal;

public class Bird  extends Animal{

    private int wingSpan;

    public Bird(int age, String gender, int weightInPounds, int wingSpan){
        super(age, gender, weightInPounds);
        this.wingSpan = wingSpan;
    }

    public void fly(){
        System.out.println("Flying ...");
    }
}
