package me.onesrodriguez.empirepets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PetShop {

    public static ItemStack mooCow = new ItemStack(Material.MONSTER_EGG, 1, (short) 92);
    public static ItemStack baaSheep = new ItemStack(Material.MONSTER_EGG, 1, (short) 91);
    public static ItemStack oinkPig = new ItemStack(Material.MONSTER_EGG, 1, (short) 90);
    public static ItemStack Stevie = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
    
    public static List<String> cowLore = new ArrayList<String>();
    public static List<String> sheepLore = new ArrayList<String>();
    public static List<String> pigLore = new ArrayList<String>();
    public static List<String> steveLore = new ArrayList<String>();
    
    public static void openPetShop(Player player){
        Inventory inv = Bukkit.createInventory(null, 9, "§8[§6Pet§8] §ePet§lShop");
         
        ItemMeta cowMeta = mooCow.getItemMeta();
        cowMeta.setDisplayName("§cMoooo§lCow");
        cowLore.add("§cEats grass. Feed it hay.");
        cowLore.add("§8\u000bb 3000 tokens.");
        cowMeta.setLore(cowLore);
        mooCow.setItemMeta(cowMeta);

        ItemMeta sheepMeta = baaSheep.getItemMeta();
        sheepMeta.setDisplayName("§fBaaa§lSheep");
        sheepLore.add("§fMooo. Oink. §lPurr.");
        sheepLore.add("§8\u000bb 3000 tokens.");
        sheepMeta.setLore(sheepLore);
        baaSheep.setItemMeta(sheepMeta);

        ItemMeta pigMeta = oinkPig.getItemMeta();
        pigMeta.setDisplayName("§dOinky§lPig");
        pigLore.add("§dWhat's new piggycat? §lWOAHWOAHWOAH!");
        pigLore.add("§8\u000bb 3000 tokens.");
        pigMeta.setLore(pigLore);
        oinkPig.setItemMeta(pigMeta);
        
        ItemMeta stevieMeta = Stevie.getItemMeta();
        stevieMeta.setDisplayName("§aMr§lSteve");
        steveLore.add("§aOoo. Fancy.");
        steveLore.add("§8\u000bb 3000 tokens.");
        stevieMeta.setLore(steveLore);
        Stevie.setItemMeta(stevieMeta);

        inv.setItem(1, mooCow);
        inv.setItem(3, baaSheep);
        inv.setItem(5, oinkPig);
        inv.setItem(7, Stevie);

        player.openInventory(inv);
    }
    
    public static Set<String> cowOwners = new HashSet<String>();
    public static Set<String> sheepOwners = new HashSet<String>();
    public static Set<String> pigOwners = new HashSet<String>();
    public static Set<String> steveOwners = new HashSet<String>();
    
    public static boolean playerOwnsCow(Player player){
        return cowOwners.contains(player.getName());
    }
    
    public static boolean playerOwnsSheep(Player player){
        return sheepOwners.contains(player.getName());
    }
    
    public static boolean playerOwnsPig(Player player){
        return pigOwners.contains(player.getName());
    }
    
    public static boolean playerOwnsSteve(Player player){
        return steveOwners.contains(player.getName());
    }
    
}
