package virtual_Pet;

import java.util.Locale;
import java.util.Scanner;

public class cd VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a virtual_Pet.VirtualPet object in this method
        VirtualPet Journey = new VirtualPet("Journey", 6, 6, 6);
        Scanner input = new Scanner(System.in);
        while (Journey.isAlive()) {
            Journey.showStatus();
            System.out.println("hit selection:feed| play| water| quit");
            String userChoice = input.nextLine();
            switch (userChoice.toLowerCase()) {
                case "feed":
                    Journey.feed();
                    break;
                case "water":
                    Journey.water();
                    break;
                case "play":
                    Journey.play();
                    break;
            }

        }

    }

}










