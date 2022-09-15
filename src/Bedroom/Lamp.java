package Bedroom;

public class Lamp {
    private int lumen ;

    public Lamp(int lumen) {
        this.lumen = lumen;
    }

    public int getLumen() {
        return lumen;
    }

    public void turnOn(){
        System.out.println("Lamp --> turn on");
    }

    public void turnOff(){
        System.out.println("Lamp --> turn off");
    }

}
