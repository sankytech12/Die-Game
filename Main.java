public class Main {
    public static void main(String[] args) {
        Player p1=PlayerFactory.createPlayer(50, 5, 10, "Player1");
        Player p2=PlayerFactory.createPlayer(100, 10, 5, "Player2");
        Arena arena=new Arena(p1, p2);
        arena.startFight();
        System.out.println(arena.getWinner());
    }
}
