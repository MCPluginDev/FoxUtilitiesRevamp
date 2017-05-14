package org.mcplugindev.foxutilities;

import java.util.logging.Level;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcplugindev.foxutilities.commands.Command_fur;
import org.mcplugindev.foxutilities.commands.Command_getgamemode;
import org.mcplugindev.foxutilities.commands.Command_getip;
import org.mcplugindev.foxutilities.listener.FoxListener;

public class FoxUtilitiesRevamp extends JavaPlugin{
    
    public static FoxUtilitiesRevamp plugin;
    public static Server server;

    @Override
    public void onLoad() {
        plugin = this;

    }

    @Override
    public void onEnable() {
        final PluginManager pm = plugin.getServer().getPluginManager();
        pm.registerEvents(new FoxListener(), plugin);
        plugin.getLogger().log(Level.INFO, "FoxUtilitiesRevamp v{0} has been enabled!", plugin.getDescription().getVersion());
        this.getCommand("fur").setExecutor(new Command_fur(plugin));
        this.getCommand("getgamemode").setExecutor(new Command_getgamemode(plugin));
        this.getCommand("getip").setExecutor(new Command_getip(plugin));
    }

    @Override
    public void onDisable() {
        plugin.getLogger().log(Level.INFO, "FoxUtilitiesRevamp v{0} has been disabled!", plugin.getDescription().getVersion());

    }
}
