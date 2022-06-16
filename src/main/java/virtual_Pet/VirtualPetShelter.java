package virtual_Pet;


import java.util.ArrayList;

public class VirtualPetShelter {


    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new RoboticDog("Henry", 6, 6, 6, 10, 10));
        shelter.add(new RoboticCat("Alein", 6, 6, 6, 10, 10));
        shelter.add(new OrganicDog("Brandon", 6, 6, 6, 10));
        shelter.add(new OrganicCat("Nguyen", 6, 6, 6, 10));

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

    public void CleanCage() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).CleanCage();
            }
        }
    }

    public void CleanLittleBox() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).CleanLittleBox();
            }
        }

    }

    public void walk() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof Walking) {
                ((Walking) pet).walk();
            }


        }

    }

    public void oilRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oilRobots();
            }
        }


    }

    public void maintainRobot() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).maintainRobots();
            }
        }


    }
}