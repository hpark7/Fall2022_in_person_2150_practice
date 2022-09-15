package Bedroom;

public class Bed {

    private String style;
    private String size;
    private int pillows;
    private int sheets;

    public Bed(String style, String size, int pillows, int sheets) {
        this.style = style;
        this.size = size;
        this.pillows = pillows;
        this.sheets = sheets;
    }

    public void make(){
        System.out.println("make() method is from Bed class");
    }

    public String getStyle() {
        return style;
    }

    public String getSize() {
        return size;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }
}
