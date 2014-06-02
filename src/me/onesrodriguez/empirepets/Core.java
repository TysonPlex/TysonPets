package me.onesrodriguez.empirepets;

import me.onesrodriguez.empirepets.commands.EmpirePet;
import me.onesrodriguez.empirepets.listeners.InventoryClick;
import me.onesrodriguez.empirepets.listeners.PlayerInteract;
import me.onesrodriguez.empirepets.listeners.PlayerInteractEntity;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{

    public static void sendMessage(Player player, String message){
        player.sendMessage(CHAT_TAG + message);
    }
    
    public static String CHAT_TAG = "§8[§5TheEmpire§8] ";
    
    @Override
    public void onEnable() {
        System.out.println("EMPIREPETS DISABLED!!!!");
        getCommand("empirepet").setExecutor(new EmpirePet(this));
        getServer().getPluginManager().registerEvents(new InventoryClick(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractEntity(), this);
    }
    
    @Override
    public void onDisable() {
        System.out.println("EMPIREPETS ENABLED!!!!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("spawnmerchant")){
            if(args.length == 1){
                if(args[0].equalsIgnoreCase("petshop")){
                    Player player = (Player) sender;
                    Villager villager = (Villager) player.getLocation().getWorld().spawn(player.getLocation(), Villager.class);
                    villager.setCustomNameVisible(true);
                    villager.setCustomName("§eAndy's Ameteur §lPetShop");
                    villager.setCanPickupItems(false);
                }
            }
            return true;
        }
        return true;
    }
    
    
}
