package me.jt.bossRealms.kits.players;

public class Player {
    private int health;

    public Player(int health){
        setHealth(health);
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }
}
