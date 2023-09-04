package me.jt.bossRealms.kits.players;

public class Players {
    private int health;

    public Players(int health){
        setHealth(health);
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }
}
