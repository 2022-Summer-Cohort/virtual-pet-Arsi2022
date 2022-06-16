package virtual_Pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a virtual_Pet.VirtualPet object in this method
        VirtualPet journey = new RoboticCat("Journey",10,10,10,10,10);
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);
        while (journey.isAlive()) {
            journey.showStatus();
            System.out.println("hit selection:feed| play| water| quit| Clean cage| clean little box| oil robots| maintain robotic");
            String userChoice = input.nextLine();
            switch (userChoice.toLowerCase()) {
                case "feed":
                    journey.feed();
                    break;
                case "water":
                    journey.water();
                    break;
                case "play":
                    journey.play();
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
            }       break;
        }

    }

}










