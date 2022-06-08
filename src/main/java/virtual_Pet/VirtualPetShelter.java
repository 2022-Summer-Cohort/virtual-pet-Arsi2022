package virtual_Pet;


import java.util.ArrayList;

public class VirtualPetShelter {


    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("Henry", 6, 6, 6));
        shelter.add(new VirtualPet("Alein", 6, 6, 6));
        shelter.add(new VirtualPet("Brandon", 6, 6, 6));
        shelter.add(new VirtualPet("Nguyen", 6, 6, 6));

    }

    public void playAll() {
        for (VirtualPet pet : shelter) {
            pet.play();
        }
    }

    void feedAll() {
        for (VirtualPet Pet : shelter) {
            Pet.feed();
        }
    }

    public void waterAll() {
        for (VirtualPet pet : shelter) {
            pet.water();
        }

    }

    public void admitPet(VirtualPet Animals) {
        shelter.add(Animals);


    }

    public void adoptPet() {
        for (VirtualPet pet : shelter) {
            pet.getName();
        }
    }

    public void PetStatus(VirtualPet Animals) {
        for (VirtualPet pet : shelter) {
            Animals.showStatus();
        }

    }

    public void tick() {
        for (VirtualPet pet : shelter) {
            pet.tick();


        }

    }

    public VirtualPet getPet(int index) {
        return shelter.get(index);
    }
}