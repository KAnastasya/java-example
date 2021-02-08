public class Main {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        CarBuilder builder = new CarBuilder();

        constructor.constructCityCar(builder);
        constructor.constructSportsCar(builder);
        constructor.constructSUV(builder);

        Car car1 = builder.getResult();
        System.out.println("Car 1: " + car1.print());

        Car car2 = builder.getResult();
        System.out.println("Car 2: " + car2.print());

        Car car3 = builder.getResult();
        System.out.println("Car 3: " + car3.print());

        Diagnostics diagnostic = new Diagnostics();

        System.out.println("Car 1: " + diagnostic.characteristics(car1));
        System.out.println("Car 2: " + diagnostic.characteristics(car2));
        System.out.println("Car 3: " + diagnostic.characteristics(car3));
    }
}
