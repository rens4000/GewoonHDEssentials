package nl.gewoonhdgaming.essentials.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import nl.gewoonhdgaming.essentials.SettingsManager;

public class PlayerJoin implements Listener {
	
	SettingsManager settings = SettingsManager.getInstance();
	private String uncolor = settings.getConfig().getString("Messages.Welcome");
	private String color = ChatColor.translateAlternateColorCodes('&', uncolor);
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		if(!e.getPlayer().hasPlayedBefore()) {
			e.getPlayer().sendMessage(color);
		} else {
		e.getPlayer().sendMessage(settings.getConfig().getString("Messages.Welcome-back"));
		}
	}

}
