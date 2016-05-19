package es.goodmem.sampleproject;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SamplePlugin extends JavaPlugin implements Listener {

    @Override
    // onEnable is called when Bukkit loads the plugin
    public void onEnable() {
        // Let's register the events in this class
        getServer().getPluginManager().registerEvents(this, this);
    }
    // We add the EventHandler annotation so that the plugin knows the following lines are supposed to be treated like
    // events
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent quit) {
        // Let's create a variable for the player that left the game
        Player player = quit.getPlayer();
        // Let's broadcast a message saying that the player has left
        Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has left the game");
    }
    // Not so hard, is it? Let's create a event that broadcasts when a player joins the game
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent join) {
        Player player = join.getPlayer();
        Bukkit.broadcastMessage(ChatColor.GOLD + player.getName() + " has joined the game!");
    }
}
// We're finished, compile the plugin and upload it to your /plugins/ folder