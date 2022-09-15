package BuildMyPC;

public class Motherboard {

    private String model;
    private String manufacturer;
    private String chipset ; // AMD x570
    private int numberOfMemorySlots; //ex. 4
    private int maximumMemorySupported ; //128

    public Motherboard(String model, String manufacturer, String chipset, int numberOfMemorySlots, int maximumMemorySupported) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.chipset = chipset;
        this.numberOfMemorySlots = numberOfMemorySlots;
        this.maximumMemorySupported = maximumMemorySupported;
    }

    public void loadingProgram(String os){
        System.out.println(os + " is now loading ..");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getChipset() {
        return chipset;
    }

    public int getNumberOfMemorySlots() {
        return numberOfMemorySlots;
    }

    public int getMaximumMemorySupported() {
        return maximumMemorySupported;
    }
}
