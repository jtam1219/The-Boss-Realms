package me.jt.bossRealms.kits.boss;

public class Boss {
    private int health;

    public Boss(int health){
        setHealth(health);
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

}
