package Bedroom;

public class CreatingABedroom {

    public static void main(String[] args) {
        Wall w1 = new Wall("North");
        Wall w2 = new Wall("South");
        Wall w3 = new Wall("East");
        Wall w4 = new Wall("West");

        Ceiling ceiling = new Ceiling(20,true,5);
        Bed bed = new Bed("Modern","Queen",6,2);
        Lamp lamp = new Lamp(1000);

        Bedroom ayoko = new Bedroom("Ayoko", w1, w2, w3, w4, ceiling,
                bed,
                lamp);

        lamp.turnOn();
        ayoko.makeBed();

        lamp.turnOff();

    }
}
