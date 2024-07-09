public class PlayerFactory {
    public static Player createPlayer(int health, int strength, int attack, String name) {
        return Player
                .getPlayerBuilder()
                .setHealth(health)
                .setStrength(strength)
                .setAttack(attack)
                .setName(name)
                .build();
    }
}
