package me.onesrodriguez.empirepets;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIChooser {
    
    public static ItemStack petShop = new ItemStack(Material.DIAMOND, 1);
    public static ItemStack petChooser = new ItemStack(Material.EMERALD, 1);    
    
    public static List<String> petShopLore = new ArrayList<String>();
    public static List<String> petChooserLore = new ArrayList<String>();
    
    public static void openGUI(Player player){
        Inventory inv = Bukkit.createInventory(null, 9, "§eBuy pet or §lChoose pet?");
        
        ItemMeta petShopMeta = petShop.getItemMeta();
        petShopMeta.setDisplayName("§ePet§lShop");
        petShopMeta.setLore(petShopLore);
        petShop.setItemMeta(petShopMeta);
        
        ItemMeta petChooserMeta = petChooser.getItemMeta();
        petChooserMeta.setDisplayName("§6Pet§lChooser");
        petChooserMeta.setLore(petChooserLore);
        petChooser.setItemMeta(petChooserMeta);
        
        inv.setItem(3, petShop);
        inv.setItem(5, petChooser);
        
        player.openInventory(inv);
    }
}
