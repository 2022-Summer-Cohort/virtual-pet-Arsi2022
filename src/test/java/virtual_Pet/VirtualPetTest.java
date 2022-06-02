package virtual_Pet;
 import org.junit.jupiter.api.Assertions;

  import org.junit.jupiter.api.Test;

  import static org.junit.jupiter.api.Assertions.assertTrue;

import virtual_Pet.VirtualPet;

public class VirtualPetTest {

    @Test
    public void hungerShouldDecreaseWhenFed() {
        VirtualPet underTest = new VirtualPet("testpet", 6,6, 4);
        underTest.feed();
        Assertions.assertEquals(6, underTest.getHungerLevel());
    }
    @Test
    public void boredomLevelDecreaseWhenFed() {
        VirtualPet underTest = new VirtualPet("testpet", 6, 6, 4);
        underTest.play();
        Assertions.assertEquals(6, underTest.getBoredomLevel());
    }
    @Test
    public void thirstLevelDecreaseWhenFed() {
        VirtualPet underTest = new VirtualPet("testpet", 6, 6, 4);
        underTest.play();
        Assertions.assertEquals(4, underTest.getThirstLevel());
    }
    @Test
    public void hungerThirstBoredomShouldIncreaseWithTime() {
        VirtualPet underTest = new VirtualPet ("testpet",6,6,4);
        underTest.tick();
        assertTrue(underTest.getHungerLevel()>6);
        assertTrue(underTest.getBoredomLevel()>6);
        assertTrue(underTest.getThirstLevel()>4);

    }

}











