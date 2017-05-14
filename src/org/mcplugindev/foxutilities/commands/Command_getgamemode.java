package org.mcplugindev.foxutilities.commands;

import static org.bukkit.Bukkit.getPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.mcplugindev.foxutilities.FUR_Util;
import org.mcplugindev.foxutilities.FoxUtilitiesRevamp;

public class Command_getgamemode implements CommandExecutor {

    private FoxUtilitiesRevamp plugin;
    
    public Command_getgamemode(FoxUtilitiesRevamp plugin) {

        FoxUtilitiesRevamp.plugin = plugin;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(FUR_Util.PREFIX + "You need to state a player's username to see their gamemode!");
            return true;
        } else {
            final Player player = getPlayer(args[0]);
            sender.sendMessage(FUR_Util.PREFIX + player.getName() + "'s current gamemode is " + player.getGameMode() + ".");

        }

        return true;
    } 

}
