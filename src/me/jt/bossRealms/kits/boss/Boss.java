package me.jt.bossRealms.kits.boss;

public class Boss {
    private int health;
    private int abilityMeter;

    public Boss(){
    }

    public int getHealth(){
        return health;
    }

    public int getAbilityMeter(){
        return abilityMeter;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setAbilityMeter(int abilityMeter){
        this.abilityMeter = abilityMeter;
    }

    //Create an event that is only active during a boss fight, where the exp meter
    //is always consistently increaisng by 1 per second. Then cap it at however much
    //the ability meter is. 

    //THEN make a rightClickevent on weapon to activate the ability.
}
