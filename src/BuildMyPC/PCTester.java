package BuildMyPC;

public class PCTester {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(10,10,10);
        Case theCase = new Case("StephenXY10000","Corsair",dimension);

        Resolution resolution = new Resolution(1080,5000);
        Monitor theMonitor = new Monitor("StephenM5000","Corsair",45,resolution );
        Motherboard theMotherboard = new Motherboard("SW9000","Corsair","MS500",4,128);

        PC stephen = new PC(theCase, theMonitor, theMotherboard);

        theCase.pressPowerButton();
        theMotherboard.loadingProgram("Windows 11");


    }



}
