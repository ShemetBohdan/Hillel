package lesson4;

public class Car {

    private String colour;
    private double maxSpeed;
    private static int fuelConsumption;      // (1l)/(100km)
    private static int volumeFuel;           // liter
    private int maximumPower;                // hp

    public Car(String colour, double maxSpeed, int fuelConsumption, int volumeFuel, int maximumPower) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.volumeFuel = volumeFuel;
        this.maximumPower = maximumPower;
    }

    public Car() {
    }

    public String getColour() {
        return colour;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed >= 0){this.maxSpeed = maxSpeed;}
        else {
            System.out.println("Error maxSpeed cannot be negative");
        }
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getVolumeFuel() {
        return volumeFuel;
    }

    public void setVolumeFuel(int volumeFuel) {

        if (volumeFuel >= 60){
            this.volumeFuel = 60;
        }
    }

    public int getMaximumPower() {
        return maximumPower;
    }

    public void setMaximumPower(int maximumPower) {
        this.maximumPower = maximumPower;
    }

    public static int calcDistansion(int fuelConsumption, int volumeFuel){
        return fuelConsumption * volumeFuel;
    }
}
