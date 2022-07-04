package virtual_Pet;

public class OrganicDog extends OrganicPet implements Walking {


    public OrganicDog(String name, int hungerLevel, int boredomLevel, int thirstLevel, int cleanlinessLevel) {
        super(name, hungerLevel, boredomLevel, thirstLevel, cleanlinessLevel);
    }

    @Override
    public void walk() {
        boredomLevel--;
        cleanlinessLevel++;
    }

    @Override
    public void greeting() {
        System.out.println("my name is" + getName() + "i am a Organic dog" + "my hunger level is" + hungerLevel + "My thirst level is " + thirstLevel + "My boredom level is" + boredomLevel +  "my Cage Cleanliness is" + cleanlinessLevel);

    }
}