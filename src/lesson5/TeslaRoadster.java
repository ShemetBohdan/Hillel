package lesson5;

public class TeslaRoadster {

    public static void main(String[] args) {

        Transport transport = new Transport("Car");
        Car car = new Car("Tesla","electric Car");
        Tesla tesla = new Tesla("Tesla Roadster","coupe","red",400);

        transport.showName();
        car.showInfoCar();
        tesla.showName();
        tesla.colour();
        tesla.drive();
    }
}
