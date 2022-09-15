package BuildMyPC;

public class Case {
    private String model;
    private String manufacturer;
    private Dimension dimension;

    public Case(String model, String manufacturer, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimension = dimension;
    }


    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
