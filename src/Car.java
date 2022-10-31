public class Car {
    void start() {
        startElectricity();
        startFuelSystem();
        startCommand();
    }
    private void startElectricity() {
        System.out.println("Electricity starting...");
    }
    private void startFuelSystem() {
        System.out.println("Fuel system starting...");
    }
    private void startCommand() {
        System.out.println("Engine starting...");
    }
}