public class Main {
    public static void main(String[] args) {
        Player p1=new Player(10, 5, 10);
        System.out.println(p1.isAlive());
        Die d=new Die();
        System.out.println(d.roll());
    }
}
