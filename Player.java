class Player{
    private int health;
    private int strength;
    private int attack;
    private String name;
    public Player(PlayerBuilder builder){
        this.health=builder.health;
        this.strength=builder.strength;
        this.attack=builder.attack;
        this.name=builder.name;
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
    
    public static PlayerBuilder getBuilder(){
        return new PlayerBuilder();
    }

    public static class PlayerBuilder {
        private int health;
        private int strength;
        private int attack;
        private String name; 
        public PlayerBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public PlayerBuilder setStrength(int strength) {
            this.strength = strength;
            return this;
        }

        public PlayerBuilder setAttack(int attack) {
            this.attack = attack;
            return this;
        }
        public PlayerBuilder setName(String name){
            this.name=name;
            return this;
        }   
        public Player build(){
            return new Player(this);
        }
    }
}