package me.onesrodriguez.empirepets.listeners;

import me.onesrodriguez.empirepets.GUIChooser;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteract implements Listener{
    
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack item = event.getItem();
        
        if(action != Action.RIGHT_CLICK_AIR || action != Action.RIGHT_CLICK_BLOCK){
            return;
        }
        if(item.getType() != Material.SLIME_BALL){
            return;
        }
        
        GUIChooser.openGUI(player);
        
        
        
    }
}
