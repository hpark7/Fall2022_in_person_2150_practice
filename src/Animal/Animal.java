package Animal;

public class Animal {
    private int age;
    private String gender;
    private int weightInPounds;

    public Animal(int age, String gender, int weightInPounds){
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }

    public void eat(){
        System.out.println("Eating ..");
    }

    public void sleep(){
        System.out.println("sleeping ");
    }

    public void move(int speed){
        System.out.println("this move() method is from Animal class " + speed);
    }
}
