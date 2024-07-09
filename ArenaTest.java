import static org.junit.Assert.*;
import org.junit.Test;

public class ArenaTest {
    @Test
    public void testFight() {
        Player p1 = PlayerFactory.createPlayer(50, 5, 10, "P1");
        Player p2 = PlayerFactory.createPlayer(100, 10, 5, "P2");
        Arena arena = new Arena(p1, p2);
        arena.startFight();
        assertTrue(p1.isAlive() || p2.isAlive());
        assertFalse(p1.isAlive() && p2.isAlive());
    }
}
