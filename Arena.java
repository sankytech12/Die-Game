public class Arena {
    private Player p1,p2;
    private Die die;
    private int round;
    
    public Arena(Player p1,Player p2){
        this.p1=p1;
        this.p2=p2;
        this.die=new Die();
    }

    public void startFight(){
        Player firstAttacker=(p1.getHealth()<p2.getHealth())?p1:p2;
        Player secondAttacker=(firstAttacker==p1)?p2:p1;
        this.round=0;
        while(firstAttacker.isAlive() && secondAttacker.isAlive()){
            fightRound(firstAttacker, secondAttacker);
            if(secondAttacker.isAlive()){
                fightRound(secondAttacker, firstAttacker);
            }
        }
    }

    private void fightRound(Player attacker,Player defender){
        this.round++;
        int attackRoll=die.roll();
        int defenseRoll=die.roll();
        int attackDamage=attackRoll*attacker.getAttack();
        int defenseStrength=defenseRoll*defender.getStrength();
        int damageDealt = Math.max(0, attackDamage - defenseStrength);
        defender.reduceHealth(damageDealt);
        System.out.println("Round : "+round);
        System.out.println(attacker.getName() + " (Health: " + attacker.getHealth() + ", Strength: " + attacker.getStrength() + ", Attack: " + attacker.getAttack() + ") rolls " + attackRoll +
        ". ");
        System.out.println(defender.getName() + " (Health: " + defender.getHealth() + ", Strength: " + defender.getStrength() + ", Attack: " + defender.getAttack() + ") rolls " + defenseRoll +
        ".");
        System.out.println("Attack damage: " + attackDamage + ", Defense strength: " + defenseStrength + ", Damage dealt: " + damageDealt + ", Defender's remaining health: " + defender.getHealth());
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    public String getWinner(){
        if(p1.isAlive()){
            return "Player1 wins "+"in round "+round;
        }else if(p2.isAlive()){
            return "Player2 wins "+"in round "+round;
        }else{
            return "No winner";
        }
    }
}
