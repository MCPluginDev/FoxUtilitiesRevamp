package org.mcplugindev.foxutilities.commands;

import static org.bukkit.Bukkit.getPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.mcplugindev.foxutilities.FUR_Util;
import org.mcplugindev.foxutilities.FoxUtilitiesRevamp;

public class Command_getip implements CommandExecutor {

    private FoxUtilitiesRevamp plugin;
    
    public Command_getip(FoxUtilitiesRevamp plugin) {

        FoxUtilitiesRevamp.plugin = plugin;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        
        final Player player = getPlayer(args[0]);
        final String ip = player.getAddress().getAddress().getHostAddress().trim();
        
        if (args.length == 0) {
            sender.sendMessage(FUR_Util.PREFIX + "No player listed!");
            return true;
        } else {
            sender.sendMessage(FUR_Util.PREFIX + player.getName() + "'s ip address is " + ip + ".");
        }

        return true;
        
    } 

}
