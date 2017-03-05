package nl.gewoonhdgaming.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("heal")) {
			Player p = (Player) sender;
			p.setFoodLevel(20);
			p.setHealth(20);
		}
		return false;
	}

}
