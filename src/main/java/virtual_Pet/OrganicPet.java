package virtual_Pet;

import virtual_Pet.VirtualPet;

public abstract class OrganicPet extends VirtualPet {

    protected int cleanlinessLevel;

    public OrganicPet(String name, int hungerLevel, int boredomLevel, int thirstLevel, int cleanlinessLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel);
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public void CleanCage() {
        cleanlinessLevel = 10;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void CleanLittleBox() {
        cleanlinessLevel = 10;
    }
    @Override
    public void tick(){
        super.tick();
        cleanlinessLevel++;
    }

}






