package virtual_Pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a virtual_Pet.VirtualPet object in this method
        VirtualPet journey = new VirtualPet("Journey", 6, 6, 6);
        VirtualPetShelter shelter = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);
        while (journey.isAlive()) {
            journey.showStatus();
            System.out.println("hit selection:feed| play| water| quit");
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
            }

        }

    }

}










