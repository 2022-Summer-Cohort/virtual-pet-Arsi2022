package virtual_Pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualPetShelterTest {

    @Test
    void ShouldFeedAllTest() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.feedAll();
        assertEquals(6, underTest.getPet(0).getHungerLevel());
    }


    @Test
    public void shouldWaterAllTest() {
        VirtualPetShelter undertest = new VirtualPetShelter();
        undertest.waterAll();
        assertEquals(6, undertest.getPet(0).getThirstLevel());
    }

    @Test
    void ShouldPlayAll() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.playAll();
        assertEquals(6, underTest.getPet(0).getBoredomLevel());
    }


        @Test
    public void HungerThirstBoredomLevelShouldIncreaseWithTick() {
            VirtualPetShelter underTest = new VirtualPetShelter();
            underTest.playAll();
            Assertions.assertEquals(6, underTest.getPet(1).getBoredomLevel());
        }
}


