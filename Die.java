import java.util.Random;

public class Die {
    Random rand;

    public Die() {
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(6) + 1;  //(max-min+1)+min => generate a random number with a specific range
    }
}
