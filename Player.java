class Player{
    private int health;
    private int strength;
    private int attack;
    private String name;
    public Player(int health,int strength,int attack,String name){
        this.health=health;
        this.strength=strength;
        this.attack=attack;
        this.name=name;
    }
    public int getHealth(){
        return this.health;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getAttack(){
        return this.attack;
    }
    public String getName(){
        return this.name;
    }
    public void reduceHealth(int damage){
        this.health=Math.max(0,this.health-damage);
    }
    public boolean isAlive(){
        return this.health>0;
    }
}