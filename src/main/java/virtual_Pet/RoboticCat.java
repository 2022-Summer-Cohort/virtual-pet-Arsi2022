package virtual_Pet;

public class RoboticCat extends RoboticPet{

    public RoboticCat(String name, int hungerLevel, int boredomLevel, int thirstLevel, int oilLevel, int maintenanceLevel){
        super(name, hungerLevel, boredomLevel, thirstLevel, oilLevel, maintenanceLevel);
    }
    @Override
    public void greeting() {
        System.out.println("my name is" + getName() + " i am a Robotic cat " + " my Oil level is " + oilLevel + " My maintenance level is " + maintenanceLevel);

    }
}
