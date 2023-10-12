package oopgeneralsfight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralTest {

    @Test
    void punchTest1() {
        GreekGeneral leonidas = new GreekGeneral("Leonidas", 20);
        GreekGeneral nero = new GreekGeneral("Nero Claudius Drusus", 28);
        nero.punch(leonidas);
        assertEquals(28, nero.getMotivation());
        assertEquals(18 ,leonidas.getMotivation());
    }
    @Test
    void punchTest2() {
        GreekGeneral leonidas = new GreekGeneral("Leonidas", 20);
        GreekGeneral nero = new GreekGeneral("Nero Claudius Drusus", 0);
        nero.punch(leonidas);
        assertEquals(0, nero.getMotivation());
        assertEquals(20 ,leonidas.getMotivation());
    }
    @Test
    void toStringTest() {
        GreekGeneral leonidas = new GreekGeneral("Leonidas", 20);
        assertEquals("Leonidas is not motivated anymore.", leonidas.toString());
    }
    @Test
    void toStringTest2() {
        GreekGeneral general = new GreekGeneral("Hovnous", 40);
        assertEquals("Hovnous is well motivated.", general.toString());
    }

}