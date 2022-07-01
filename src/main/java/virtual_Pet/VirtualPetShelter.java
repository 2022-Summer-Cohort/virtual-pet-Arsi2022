package virtual_Pet;


import java.util.ArrayList;

public class VirtualPetShelter {



    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        this.shelter= new ArrayList<>();
    }




    public void playAll() {
        for (VirtualPet pet : shelter) {
            pet.play();
        }
    }

    void feedAll() {
        for (VirtualPet pet : shelter) {
            pet.feed();
        }
    }

    public void waterAll() {
        for (VirtualPet pet : shelter) {
            pet.water();
        }

    }
    public void showAllPetStatus() {
        for (VirtualPet pet : shelter) {
            pet.greeting();
        }

    }
    public void admitPet(VirtualPet Animals) {
        shelter.add(Animals);


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

    public VirtualPet findPetByName(String name) {
        for (VirtualPet pet : shelter) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }

        }
        return null;
    }

    public void adoptPet(String petName) {
        shelter.remove((findPetByName(petName)));
    }
}
