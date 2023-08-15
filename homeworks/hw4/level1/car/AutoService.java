package de.telran.geork.homeworks.hw4.level1.car;

public class AutoService implements ModernAutoService{

    public AutoService() {
    }



    @Override
    public String repair(String state) {
        if (state.equalsIgnoreCase("broken")){
            return "Your car is repaired.";
        } else{
            return "Your car is not broken.";
        }

    }

    @Override
    public String changeTires(Tire wheels) {
        return "I have change tires of your car.";
    }
}
