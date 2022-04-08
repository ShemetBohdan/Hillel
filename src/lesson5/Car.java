package lesson5;

public class Car extends Transport{

    private String type;

    public Car(String name) {
        super(name);
    }

    public Car(String name, String type) {
        super(name);
        this.type = type;
    }

    public void showInfoCar(){
        System.out.println("Type for car: " + type);
    }

}
