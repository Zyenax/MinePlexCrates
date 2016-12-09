package net.MPCrates.main;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable(){
		Bukkit.getPluginManager().registerEvents(new Utils(this), this);
		System.out.println("Enabled");
		registerListeners();
	}
	
	public void onDisable(){
		System.out.println("Disabled");
	}
	
	public void registerListeners(){
		PluginManager manager = Bukkit.getPluginManager();
		manager.registerEvents(new Utils(this), this);
		manager.registerEvents(new CrateHandler(this), this);
	}

}
