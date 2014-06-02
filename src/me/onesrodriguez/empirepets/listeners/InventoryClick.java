package me.onesrodriguez.empirepets.listeners;

import com.dsh105.echopet.api.EchoPetAPI;
import com.dsh105.echopet.compat.api.entity.IPet;
import com.dsh105.echopet.compat.api.entity.PetType;
import me.onesrodriguez.empirepets.GUIChooser;
import me.onesrodriguez.empirepets.PetGUI;
import me.onesrodriguez.empirepets.PetShop;
import me.onesrodriguez.empirepets.api.PetAPIHandler;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener{

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        if(!event.getInventory().getName().equalsIgnoreCase("§8[§6Pet§8] §ePet§lShop") | !event.getInventory().getName().equalsIgnoreCase("§8[§6Pet§8] §6Pet §lChooser") | !event.getInventory().getName().equalsIgnoreCase("§eBuy pet or §lChoose pet?")){
            return;
        }
        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);
        
        if(event.getCurrentItem() == null || event.getCurrentItem().getType() == Material.AIR || !event.getCurrentItem().hasItemMeta()){
            player.closeInventory();
            return;
        }
        
        if(event.getCurrentItem() == PetShop.mooCow){
            //TODO Add token system
            IPet cowPet = PetAPIHandler.getEchoPetAPI().givePet(player, PetType.COW, false);
            cowPet.setPetName("&c" + player.getName() + "'s Moo&lCow");
            PetAPIHandler.getEchoPetAPI().addGoal(cowPet, EchoPetAPI.GoalType.FOLLOW_OWNER);
           
        }
        
        if(event.getCurrentItem() == PetShop.baaSheep){
            IPet cowPet = PetAPIHandler.getEchoPetAPI().givePet(player, PetType.SHEEP, false);
            cowPet.setPetName("&f" + player.getName() + "'s Baa&lSheep");
            PetAPIHandler.getEchoPetAPI().addGoal(cowPet, EchoPetAPI.GoalType.FOLLOW_OWNER);
        }
        
        if(event.getCurrentItem() == PetShop.oinkPig){
            //TODO Add token system
            IPet cowPet = PetAPIHandler.getEchoPetAPI().givePet(player, PetType.PIG, false);
            cowPet.setPetName("&d" + player.getName() + "'s Oink&lPig");
            PetAPIHandler.getEchoPetAPI().addGoal(cowPet, EchoPetAPI.GoalType.FOLLOW_OWNER);
        }
        
        if(event.getCurrentItem() == PetShop.Stevie){
            //TODO Add token system
            IPet cowPet = PetAPIHandler.getEchoPetAPI().givePet(player, PetType.HUMAN, false);
            cowPet.setPetName("&a" + player.getName() + "'s &lStevie");
            PetAPIHandler.getEchoPetAPI().addGoal(cowPet, EchoPetAPI.GoalType.FOLLOW_OWNER);
        }
        if(event.getCurrentItem() == GUIChooser.petShop){
            PetShop.openPetShop(player);
        }
        if(event.getCurrentItem() == GUIChooser.petChooser){
            PetGUI.openPetGUI(player);
        }
        
    }
}
