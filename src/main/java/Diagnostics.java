public class Diagnostics {
    public String characteristics(Car car) {

        Engine engine = car.getEngine();
        engine.on();
        System.out.println("Engine on");
        engine.off();
        System.out.println("Engine off");

        TripComputer tripComputer = car.getTripComputer();
        tripComputer.showFuelLevel();
        tripComputer.showStatus();

        return "Car is ready for the trip \n";

    }
}
