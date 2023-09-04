package me.jt.bossRealms.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import me.jt.bossRealms.Main;

public class testSunWarriorCmd implements CommandExecutor{
    private Main plugin;

    public testSunWarriorCmd(Main plugin){
        this.plugin = plugin;
        plugin.getCommand("giveSunWarrior").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player p = (Player) sender;
        p.getServer().broadcastMessage("Selected SunWarrior.");
        p.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
        return false;
    }
}