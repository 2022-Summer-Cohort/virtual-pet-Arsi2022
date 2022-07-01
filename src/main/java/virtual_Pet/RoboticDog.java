package virtual_Pet;

public class RoboticDog extends RoboticPet implements Walking {


    public RoboticDog(String name, int hungerlevel, int boredomLevel, int thirstLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerlevel, boredomLevel, thirstLevel, oilLevel, maintenanceLevel);
    }

    @Override
    public void walk() {
        boredomLevel--;
        maintenanceLevel++;
        oilLevel++;
    }

    @Override
    public void greeting() {
        System.out.println("my name is " + getName() + " i am a Robotic dog" + " my Oil level is" + oilLevel + " My maintenance level is " + maintenanceLevel);

    }
}