package virtual_Pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a virtual_Pet.VirtualPet object in this method
        VirtualPet shelter1 = new RoboticCat("journey", 10, 10, 10, 10, 10);
        VirtualPet Henry = new RoboticDog("Henry", 6, 6, 6, 10, 10);
        VirtualPet Alein = new RoboticCat("Alein", 6, 6, 6, 10, 10);
        VirtualPet Brandon = new OrganicDog("Brandon", 6, 6, 6, 10);
        VirtualPet Nguyen = new OrganicCat("Nguyen", 6, 6, 6, 10);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.admitPet(Henry);
        shelter.admitPet(Alein);
        shelter.admitPet(Brandon);
        shelter.admitPet(Nguyen);
        shelter.admitPet(shelter1);
        
        Scanner input = new Scanner(System.in);
        while (true) {
            shelter.showAllPetStatus();
//

            System.out.println("hit selection:feed| play| water| quit| Clean cage| clean little box| oil robots| maintain robotic");
            String userChoice = input.nextLine();
            switch (userChoice.toLowerCase()) {
                case "feed":
                    shelter.feedAll();
                    break;
                case "water":
                    shelter.waterAll();
                    break;
                case "play":
                    shelter.playAll();
                    break;
                case "admit":
                    System.out.println("Enter pet name.");
                    String petName = input.nextLine();

                    System.out.println("Is it robotic or organic?");
                    String type = input.nextLine();
                    System.out.println("Is it a dog or cat?");
                    String dogorCat = input.nextLine();
                    if (type.equalsIgnoreCase("robotic") && dogorCat.equalsIgnoreCase("dog")) {

                        shelter.admitPet(new RoboticDog(petName, 10, 10, 10, 10, 10));
                    } else if (type.equalsIgnoreCase("robotic") && dogorCat.equalsIgnoreCase("cat")) {

                        shelter.admitPet(new RoboticCat(petName, 10, 10, 10, 10, 10 ));
                    } else if (type.equalsIgnoreCase("organic") && dogorCat.equalsIgnoreCase("dog")) {


                        shelter.admitPet(new OrganicDog(petName, 10, 10, 10, 10));
                    } else if (type.equalsIgnoreCase("organic") && dogorCat.equalsIgnoreCase("cat")) {


                        shelter.admitPet(new OrganicCat(petName, 10, 10, 10, 10));
                    }
                    break;
                case "adopt":
                    System.out.println("Which pet would you want to adopt");
                    String adaptPetName = input.nextLine();
                    shelter.adoptPet(adaptPetName);
                    break;
                case "walk":
                    shelter.walk();
                    break;
                case "clean cage":
                    shelter.CleanCage();
                    break;
                case "clean litter box":
                    shelter.CleanLittleBox();
                    break;
                case "oil robots":
                    shelter.oilRobots();
                    break;
                case "maintain robotic":
                    shelter.maintainRobot();
                    break;

            } shelter.tick();
            

        }
    }
}






