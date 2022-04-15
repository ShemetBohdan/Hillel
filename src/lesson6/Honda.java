package lesson6;

public class Honda extends Car implements Distance {

    public Honda(String name, double speed, double time) {
        super(name, speed, time);
    }

    public void showResult(){
        double distance = calcDistans(getTime(),getSpeed());
        System.out.println("Distance traveled: " + distance + " km/h");
    }

    @Override
    public double calcDistans(double time, double speed) {
        return getTime() * getSpeed();
    }

    @Override
    void changeSpeed() {
        System.out.println("Macine speed " + getSpeed() + " km/h");
    }

}
