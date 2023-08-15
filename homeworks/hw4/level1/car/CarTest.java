package de.telran.geork.homeworks.hw4.level1.car;

public class CarTest {
    public static void main(String[] args) {
        Auto car = new ElectricCar("Rimac", "Nevera", 2023, "electricity");
        Auto car1 = new BenzineCar("Nissan", "GTR", 2020, "benzine");
        Auto car2 = new DieselCar("VW", "Golf", 2000, "diesel");
        Auto car3 = new HybridCar("Porsche", "918", 2015, "electricity");

        System.out.println(car.drive());
        System.out.println(car1.start());
        System.out.println(car2.drive());
        System.out.println(car3.start());

    }
}
