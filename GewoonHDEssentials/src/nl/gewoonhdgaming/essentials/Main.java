package nl.gewoonhdgaming.essentials;

import org.bukkit.plugin.java.JavaPlugin;

import nl.gewoonhdgaming.essentials.commands.Heal;

public class Main extends JavaPlugin {

	SettingsManager settings = SettingsManager.getInstance();
	
	@Override
	public void onEnable() {
		SettingsManager.getInstance().setup(this);
		getCommand("Heal").setExecutor(new Heal());
	}
	
	@Override
	public void onDisable() {
		
	}

}
