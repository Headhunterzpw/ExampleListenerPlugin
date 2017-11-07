package nl.jessegeerts.publicplugins.examplelistenerplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new Join(), this);
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e){
        if(!e.getPlayer().hasPermission("Random.NoDrop")){
            e.setCancelled(true);
        }
    }
}
