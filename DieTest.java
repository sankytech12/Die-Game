import static org.junit.Assert.*;
import org.junit.Test;

public class DieTest {
    @Test
    public void testDieRoll() {
        Die die = new Die();
        for (int i = 0; i < 1000; i++) {
            int roll = die.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}
