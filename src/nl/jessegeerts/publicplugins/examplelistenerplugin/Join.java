package nl.jessegeerts.publicplugins.examplelistenerplugin;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&6&l%player% &cheeft de server gejoined".replace("%player%", e.getPlayer().getName())));
    }
}
