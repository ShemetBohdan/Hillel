package lesson5;

public class Tesla extends Car{

    private String colour;
    private double maxSpeed;

    public Tesla(String name, String type,String colour, double maxSpeed) {
        super(name, type);
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void drive(){
        System.out.println("The car is moving at a max speed more: " + maxSpeed + " km/h");
    }

    public void colour(){
        System.out.println("Colour: " + colour);
    }

    @Override
    public void showName(){
        System.out.println("Model: " + getName());
    }
}
