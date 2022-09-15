package Bedroom;

public class Ceiling {
    private int height ;
    private boolean fan;
    private int numberOfLights;

    public Ceiling(int height, boolean fan, int numberOfLights) {
        this.height = height;
        this.fan = fan;
        this.numberOfLights = numberOfLights;
    }

    public int getHeight() {
        return height;
    }

    public boolean isFan() {
        return fan;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }
}
