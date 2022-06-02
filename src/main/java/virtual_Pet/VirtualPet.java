package virtual_Pet;

public class VirtualPet {


    private String name;
    private int hungerLevel;
    private int boredomlevel;
    private int thirstlevel;

    public VirtualPet(String name, int hungerlevel, int boredomLevel, int thirstLevel) {
        this.name = name;
        this.hungerLevel = hungerlevel;
        this.boredomlevel = boredomLevel;
        this.thirstlevel = thirstLevel;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getBoredomLevel() {
        return boredomlevel;
    }

    public int getThirstLevel() {
        return thirstlevel;
    }

    public void showStatus() {
        System.out.println("Im" + getName() + "Im" + hungerLevel + "Im" + boredomlevel + "Im" + thirstlevel);

    }

    public void feed() {
        hungerLevel = 6;
    }

    public void play() {
        boredomlevel = 6;
    }

    public void water() {
        thirstlevel = 6;
    }

    public void tick() {

        hungerLevel++;
        thirstlevel++;
        boredomlevel++;

    }

    public boolean isAlive() {
        if (hungerLevel > 11 || thirstlevel > 11 || boredomlevel > 11) {
            return false;
        }
        return true;

    }

}












