package org.mcplugindev.foxutilities.commands;

import static org.bukkit.Bukkit.getPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.mcplugindev.foxutilities.FUR_Util;
import org.mcplugindev.foxutilities.FoxUtilitiesRevamp;

public class Command_troll implements CommandExecutor {

    private FoxUtilitiesRevamp plugin;
    
    public Command_troll(FoxUtilitiesRevamp plugin) {

        FoxUtilitiesRevamp.plugin = plugin;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        
        if (args == 0) {
            
        }
        else {
            sender.sendMessage("");
                }
        
        return true;
        
    } 

}
