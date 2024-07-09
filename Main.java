import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player1 health, strength and attack value :");
        int h1 = sc.nextInt(), s1 = sc.nextInt(), a1 = sc.nextInt();
        System.out.print("Enter Player2 health, strength and attack value :");
        int h2 = sc.nextInt(), s2 = sc.nextInt(), a2 = sc.nextInt();
        Player p1 = PlayerFactory.createPlayer(h1, s1, a1, "Player1");
        Player p2 = PlayerFactory.createPlayer(h2, s2, a2, "Player2");
        // Player p1=PlayerFactory.createPlayer(50, 5, 10, "Player1");
        // Player p2=PlayerFactory.createPlayer(100, 10, 5, "Player2");
        Arena arena = new Arena(p1, p2);
        arena.startFight();
        System.out.println(arena.getWinner());
    }
}
