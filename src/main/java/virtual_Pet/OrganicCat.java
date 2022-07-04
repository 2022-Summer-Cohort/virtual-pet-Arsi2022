package virtual_Pet;

public class OrganicCat extends OrganicPet {

    public OrganicCat(String name, int hungerLevel, int boredomLevel, int thirstLevel, int cleanlinessLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel, cleanlinessLevel);
    }


    @Override
    public void greeting() {
        System.out.println("my name is" + getName() + "i am a Organic cat" + "my hunger level is" + hungerLevel + "My thirst level is " + thirstLevel + "My boredom level is" + boredomLevel +  "my litter box level is" + cleanlinessLevel);

    }
}
