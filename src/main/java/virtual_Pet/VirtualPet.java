package virtual_Pet;

public abstract class VirtualPet {


    private  int thirstlevel;
    private  int boredomlevel;
    private  String name;
    protected int hungerLevel;
    protected int boredomLevel;
    protected int thirstLevel;

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
        hungerLevel --;
    }

    public void play() {
        boredomlevel --;
    }

    public void water() {
        thirstlevel --;
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

    public abstract void greeting();


    }












