package Dog;

public class Dog {
    //attributes or data
    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void writeOutput() {
        System.out.printf("Name: %s\nBreed: %s\n%s's age: %d\n%s's age in human " +
                "years: %d", name, breed, name, age, name, getAgeInHumanYears());
    }

    public int getAgeInHumanYears() {
        //if age is <= 2  apply age * 11
        // else if age is older than 2, then apply 22 + (age - 2) * 5
        int humanYears = 0;
        if (age <= 2) {
            humanYears = age * 11;
        } else {
            humanYears = 22 + (age - 2) * 5;
        }

        return humanYears;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Breed: " + breed + "\n" + "Age: " +
                age + "\n" + "Age in Human years: " + getAgeInHumanYears();
    }
}
