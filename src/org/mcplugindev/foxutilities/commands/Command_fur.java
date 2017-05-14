package org.mcplugindev.foxutilities.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.mcplugindev.foxutilities.FUR_Util;
import org.mcplugindev.foxutilities.FoxUtilitiesRevamp;

public class Command_fur implements CommandExecutor {

    private FoxUtilitiesRevamp plugin;
    
    public Command_fur(FoxUtilitiesRevamp plugin) {

        FoxUtilitiesRevamp.plugin = plugin;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(FUR_Util.PREFIX + "This server is running FoxUtilitiesRevamp version " + plugin.getDescription().getVersion() + ".");
            sender.sendMessage(FUR_Util.PREFIX + "FoxUtilitiesRevamp is a remake of Dylan Fox's original plugin, FoxUtilitiesCore.");
        } else {
            sender.sendMessage(FUR_Util.PREFIX + "oh");
            return true;
        }

        return true;
    } 

}
