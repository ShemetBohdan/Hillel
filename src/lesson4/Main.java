package lesson4;

public class Main {

    public static void main(String[] args) {

        Car mazdaCombi = new Car(" silver",310,7,62,145);
        mazdaCombi.setMaxSpeed(mazdaCombi.getMaxSpeed());
        mazdaCombi.setVolumeFuel(mazdaCombi.getVolumeFuel());
        System.out.println("Colour car: " + mazdaCombi.getColour()+"\n"+
                "Max speed: " + mazdaCombi.getMaxSpeed()+ " km/h"+"\n"+
                "Fuel consumption: " + mazdaCombi.getFuelConsumption()+ " (l.)/(100km)"+"\n"+
                "Volume fuel: " + mazdaCombi.getVolumeFuel() + " (l.)"+"\n"+
                "Maximum power: "+ mazdaCombi.getMaximumPower() + " (hp)"+"\n"+
                "Fuel supply for: "+ Car.calcDistansion(mazdaCombi.getFuelConsumption(),
                mazdaCombi.getVolumeFuel()) + " (km)");
    }
}
