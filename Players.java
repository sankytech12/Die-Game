class Players{
    private int health;
    private int strength;
    private int attack;
    Players(int health,int strength,int attack){
        this.health=health;
        this.strength=strength;
        this.attack=attack;
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
    public void reduceHealth(int damage){
        this.health=Math.max(0,this.health-damage);
    }
    public boolean isAlive(){
        return this.health>0;
    }
}