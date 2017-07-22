package nl.gewoonhdgaming.bp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(this, this);
	}
	
	@EventHandler
	public void onBuild(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		
		if(!p.hasPermission("GHG.Build")) {
			e.setCancelled(true);
			p.sendMessage(ChatColor.RED + "Het is niet toegestaan om dat te doen!");
			return;
		}
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		
		if(!p.hasPermission("GHG.Build")) {
			e.setCancelled(true);
			p.sendMessage(ChatColor.RED + "Het is niet toegestaan om dat te doen!");
			return;
		}
	}

}
