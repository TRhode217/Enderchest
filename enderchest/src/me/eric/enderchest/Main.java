package me.eric.enderchest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("Enderchest plugin has been enabled.");
    }
    @Override
    public void onDisable(){
        getLogger().info("Ender chest plugin has been disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if((command.getName().equalsIgnoreCase("enderchest"))||command.getName().equalsIgnoreCase("echest")){
                p.openInventory(p.getEnderChest());
                return true;
            }
        }
        return false;
    }
}
