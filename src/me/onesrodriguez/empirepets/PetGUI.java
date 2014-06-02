package me.onesrodriguez.empirepets;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PetGUI {
    
    public static ItemStack mooCow = new ItemStack(Material.MONSTER_EGG, 1, (short) 92);
    public static ItemStack baaSheep = new ItemStack(Material.MONSTER_EGG, 1, (short) 91);
    public static ItemStack oinkPig = new ItemStack(Material.MONSTER_EGG, 1, (short) 90);
    public static ItemStack Stevie = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
    public static ItemStack noPets = new ItemStack(Material.MONSTER_EGG, 1);
    
    public static List<String> cowLore = new ArrayList<String>();
    public static List<String> sheepLore = new ArrayList<String>();
    public static List<String> pigLore = new ArrayList<String>();   
    public static List<String> stevieLore = new ArrayList<String>();    
    public static List<String> noPetsLore = new ArrayList<String>();
    
    
    public static void openPetGUI(Player player){
        Inventory inv = Bukkit.createInventory(null, 9, "§8[§6Pet§8] §6Pet §lChooser");
        
        cowLore.add("§cEats grass. Feed it hay.");
        cowLore.add("§8\u000bb 3000 tokens.");
        
        sheepLore.add("§fMooo. Oink. §lPurr.");
        sheepLore.add("§8\u000bb 3000 tokens.");
        
        pigLore.add("§dWhat's new piggycat? §lWOAHWOAHWOAH!");
        pigLore.add("§8\u000bb 3000 tokens.");
        
        stevieLore.add("§aOoo. Fancy.");
        stevieLore.add("§8\u000bb 3000 tokens.");
        
        noPetsLore.add("§8\u000bb Buy more at the &ePet&lShop!");
        
        ItemMeta cowMeta = mooCow.getItemMeta();
        cowMeta.setDisplayName("§cMoooo§lCow");
        cowMeta.setLore(cowLore);
        mooCow.setItemMeta(cowMeta);

        ItemMeta sheepMeta = baaSheep.getItemMeta();
        sheepMeta.setDisplayName("§fBaaa§lSheep");
        sheepMeta.setLore(sheepLore);
        baaSheep.setItemMeta(sheepMeta);
        
        ItemMeta pigMeta = oinkPig.getItemMeta();
        pigMeta.setDisplayName("§dOink§lPig");
        pigMeta.setLore(pigLore);
        oinkPig.setItemMeta(pigMeta);
        
        ItemMeta stevieMeta = Stevie.getItemMeta();
        stevieMeta.setDisplayName("§aMr§lSteve");
        stevieMeta.setLore(stevieLore);
        Stevie.setItemMeta(stevieMeta);
        
        ItemMeta noPetsMeta = noPets.getItemMeta();
        noPetsMeta.setDisplayName("§8No pets ;(");
        noPetsMeta.setLore(noPetsLore);
        Stevie.setItemMeta(noPetsMeta);

        if(PetShop.playerOwnsCow(player) == true)
           inv.setItem(1, mooCow);
        if(PetShop.playerOwnsSheep(player) == true)
           inv.setItem(3, baaSheep);
        if(PetShop.playerOwnsPig(player) == true)
           inv.setItem(5, oinkPig);
        if(PetShop.playerOwnsSteve(player) == true)
           inv.setItem(7, Stevie);
        if(PetShop.playerOwnsCow(player) == false | PetShop.playerOwnsSheep(player) == false | PetShop.playerOwnsPig(player) == false | PetShop.playerOwnsSteve(player) == false){
           inv.setItem(0, noPets);
        }
    }
}

