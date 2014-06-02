package me.onesrodriguez.empirepets.listeners;

import me.onesrodriguez.empirepets.Core;
import me.onesrodriguez.empirepets.GUIChooser;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class PlayerInteractEntity implements Listener{

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event){
        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();
        
        if(entity.getType() != EntityType.ENDERMAN){
            return;
        }
        
        Villager villager = (Villager) event.getRightClicked();
        event.setCancelled(true);
        
        if(!villager.getCustomName().equals("§eAndy's Ameteur §lPetShop") && villager.getCanPickupItems() == true){
            return;
        }
        player.playEffect(villager.getLocation(), Effect.SMOKE, 12);
        player.playNote(villager.getLocation(), Instrument.BASS_GUITAR, Note.natural(1, Note.Tone.C));
        player.playNote(villager.getLocation(), Instrument.PIANO, Note.natural(1, Note.Tone.C));
        GUIChooser.openGUI(player);
        Core.sendMessage(player, ChatColor.GOLD + "Opening Pet GUI...");
    }
}
