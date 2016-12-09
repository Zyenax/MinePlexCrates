package net.MPCrates.main;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftFirework;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class CrateHandler implements Listener{

	private static Main plugin;
	
	public CrateHandler(Main hub) {
		CrateHandler.plugin = hub;
	}
	
	public static HashMap<String, String> CrateContainer = new HashMap<String, String>();
	public static HashMap<String, BukkitTask> Bullets = new HashMap<String, BukkitTask>();
	
	@EventHandler
	public void onClick(final PlayerInteractEvent e){
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
			if(e.getHand().equals(EquipmentSlot.HAND)){
		if(e.getClickedBlock().getType().equals(Material.ENDER_CHEST)){
			if(!CrateContainer.containsKey("CRATE1")){
				BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						CrateContainer.put("CRATE1", "CRATE1");
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(3, 0, 1), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(3, 0, 1)).setType(Material.ENDER_CHEST);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation()).setType(Material.AIR);
					}
				}, 20 * 1);
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(3, 0, -1), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(3, 0, -1)).setType(Material.ENDER_CHEST);
					}
				}, 20 * 2);
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(1, 0, -3), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(1, 0, -3)).setType(Material.ENDER_CHEST);
					}
				}, 20 * 3);
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(-1, 0, -3), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(-1, 0, -3)).setType(Material.ENDER_CHEST);
					}
				}, 20 * 4);
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(-3, 0, -1), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(-3, 0, -1)).setType(Material.ENDER_CHEST);
					}
				}, 20 * 5);
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(-3, 0, 1), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(-3, 0, 1)).setType(Material.ENDER_CHEST);
					}
				}, 20 * 6);
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(-1, 0, 3), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(-1, 0, 3)).setType(Material.ENDER_CHEST);
					}
				}, 20 * 7);
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(1, 0, 3), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(1, 0, 3)).setType(Material.ENDER_CHEST);
					}
				}, 20 * 8);
				
				
				
				
				scheduler.runTaskLater(plugin, new Runnable() {
					public void run() {
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(3, 0, 1)).setType(Material.AIR);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(3, 0, 1), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(3, 0, -1)).setType(Material.AIR);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(3, 0, -1), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(-3, 0, 1)).setType(Material.AIR);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(-3, 0, 1), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(-3, 0, -1)).setType(Material.AIR);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(-3, 0, -1), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(1, 0, 3)).setType(Material.AIR);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(1, 0, 3), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(1, 0, -3)).setType(Material.AIR);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(1, 0, -3), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(-1, 0, -3)).setType(Material.AIR);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(-1, 0, -3), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation().add(-1, 0, 3)).setType(Material.AIR);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation().add(-1, 0, 3), Effect.STEP_SOUND, 130);
						e.getClickedBlock().getWorld().getBlockAt(e.getClickedBlock().getLocation()).setType(Material.ENDER_CHEST);
						e.getClickedBlock().getWorld().playEffect(e.getClickedBlock().getLocation(), Effect.STEP_SOUND, 130);
						CrateContainer.remove("CRATE1");
						FireworkEffect fEffect = FireworkEffect
								.builder()
								.trail(true)
								.flicker(true)
								.withColor(
										new Color[] { Color.FUCHSIA,
												Color.TEAL,
												Color.LIME })
								.with(FireworkEffect.Type.BURST)
								.build();
						playFirework(e.getClickedBlock().getLocation().add(0.5, 0.5, 0.5), fEffect, 1);
						
					}
				}, 20 * 16);
		}else{
			e.getPlayer().sendMessage(Utils.color("&cCrate in use!"));
		}
		}
			}
		}
	}
	
	
	public static void playFirework(Location paramLocation,
			FireworkEffect paramFireworkEffect, Integer lifeSpan) {
		Entity localEntity = paramLocation.getWorld().spawnEntity(
				paramLocation, EntityType.FIREWORK);
		Firework localFirework = (Firework) localEntity;
		FireworkMeta localFireworkMeta = localFirework.getFireworkMeta();
		localFireworkMeta.addEffect(paramFireworkEffect);
		localFireworkMeta.setPower(1);
		localFirework.setFireworkMeta(localFireworkMeta);

		((CraftFirework) localFirework).getHandle().expectedLifespan = lifeSpan;
	}
	
}
