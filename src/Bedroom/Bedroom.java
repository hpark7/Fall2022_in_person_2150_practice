package Bedroom;

public class Bedroom {

    private String whoseRoom;

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Ceiling ceiling;

    private Bed bed;

    private Lamp lamp;


    public Bedroom(String name, Wall w1, Wall w2, Wall w3, Wall w4,
                   Ceiling ceiling, Bed bed, Lamp lamp){
        this.whoseRoom = name;
        this.wall1 = w1;
        this.wall2 = w2;
        this.wall3 = w3;
        this.wall4 = w4;

        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void makeBed(){
        System.out.println("makeBed() method is from Bedroom class");
        bed.make();
        this.make();
    }

    public void make(){
        straightenSheet();
    }

    public void straightenSheet(){
        System.out.println("You must straighten sheets before leave.");
    }
    public String getWhoseRoom() {
        return whoseRoom;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
