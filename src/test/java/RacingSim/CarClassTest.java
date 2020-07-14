package RacingSim;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarClassTest {

    @Test
    public void ConstructorTest(){
        Car c1 = new Car("Orange", "Czara");

        assertEquals("Orange", c1.team);
        assertEquals("Czara",c1.driver);
        assertEquals(0.0,c1.speed);
        assertEquals(0.0, c1.distance);
        assertEquals(0.0, c1.lapDistance);
        assertEquals(0,c1.currentLap);
        assertEquals(0.0, c1.totalTime);

    }

    @Test
    public void LapTests(){
        Car c1 = new Car("Orange", "Czara");



    }
}
