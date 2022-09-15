package Dog;

public class DogTester {
    public static void main(String[] args) {

        Dog dude = new Dog();
        dude.setName("Dude");
        dude.setBreed("Maltese");
        dude.setAge(12);
       String name = dude.getName();
      //  System.out.println(dude);
        dude.writeOutput();

       // System.out.println(dude);
    }
}
