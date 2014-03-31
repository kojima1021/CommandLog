package net.bukkit_plugin.kojima1021.CommandLog.Event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class OnCommandEvent implements Listener {

	@EventHandler
    public void OnCommand(PlayerCommandPreprocessEvent e) {
	String prefix = ChatColor.GRAY + "[CommandLog]";
	   e.getPlayer().getServer().broadcast(prefix + e.getPlayer().getName()+ "  "+e.getMessage(), "commandlog.use");
    }

}