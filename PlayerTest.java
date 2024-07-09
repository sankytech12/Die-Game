import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void testPlayerHealthReduction(){
        Player player=PlayerFactory.createPlayer(100, 10, 5, "Test");
        player.reduceHealth(80);
        assertEquals(20,player.getHealth());
        player.reduceHealth(20);
        assertEquals(0,player.getHealth());
    }
}
