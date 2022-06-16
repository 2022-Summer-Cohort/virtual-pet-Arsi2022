package virtual_Pet;

public class RoboticDog extends RoboticPet implements Walking {


    public RoboticDog(String name, int hungerlevel, int boredomLevel, int thirstLevel, int oilLevel, int maintenanceLevel) {
        super(name, hungerlevel, boredomLevel, thirstLevel, oilLevel, maintenanceLevel);
    }

    @Override
    public void walk() {

    }
}
