//package virtual_Pet;
// import org.junit.jupiter.api.Assertions;
//
//  import org.junit.jupiter.api.Test;
//
//  import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import virtual_Pet.VirtualPet;
//
//public class VirtualPetTest {
//
//    @Test
//    public void hungerShouldDecreaseWhenFed() {
//        VirtualPet underTest = new RoboticCat("testpet", 6, 6, 4, 10, 10);
//        underTest.feed();
//        Assertions.assertEquals(6, underTest.getHungerLevel());
//    }
//
//    @Test
//    public void boredomLevelDecreaseWhenFed() {
//        VirtualPet underTest = new RoboticCat("testpet", 6, 6, 4, 10, 10);
//        underTest.feed();
//        Assertions.assertEquals(6, underTest.getBoredomLevel());
//
//    }
//
//    @Test
//    public void thirstLevelDecreaseWhenFed() {
//        VirtualPet underTest = new RoboticDog("testpet", 6, 6, 4, 10, 10);
//        underTest.feed();
//        Assertions.assertEquals(6, underTest.getHungerLevel());
//
//    }
//
//    @Test
//    public void hungerThirstBoredomShouldIncreaseWithTime() {
//        VirtualPet underTest = new RoboticDog("testpet", 6, 6, 4, 10, 10);
//        Assertions.assertEquals(4, underTest.getThirstLevel());
//        underTest.tick();
//        Assertions.assertEquals(8, underTest.getBoredomLevel());
//        underTest.tick();
//        Assertions.assertEquals(7, underTest.getHungerLevel());
//        underTest.tick();
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
