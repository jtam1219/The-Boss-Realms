package me.jt.bossRealms.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.World;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import me.jt.bossRealms.Main;

public class testCommand implements CommandExecutor{
    private Main plugin;

    public testCommand(Main plugin){
        this.plugin = plugin;
        plugin.getCommand("testCommand").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player p = (Player) sender;
        Location loc = p.getLocation();
        World w = p.getWorld();
        p.getServer().broadcastMessage("This is a test.");
        w.spawnEntity(loc, EntityType.GIANT);
        return false;
    }
}
