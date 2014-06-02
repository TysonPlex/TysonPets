package me.onesrodriguez.empirepets.commands;

import me.onesrodriguez.empirepets.Core;
import me.onesrodriguez.empirepets.GUIChooser;
import me.onesrodriguez.empirepets.PetGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EmpirePet implements CommandExecutor{
    
    public Core plugin;
 
    public EmpirePet(Core plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("§4NOOOOOOOOPPPPPPPPPPPPEEEEEEEEEEE.");
        }
        Player player = (Player) sender;
        if(player.hasPermission("empirepet.member")){
            GUIChooser.openGUI(player);
        }
        if(player.hasPermission("empirepet.saxon")){
            GUIChooser.openGUI(player);
        }
        if(player.hasPermission("empirepet.bowman")){
            GUIChooser.openGUI(player);
        }
        if(player.hasPermission("empirepet.zeus")){
            GUIChooser.openGUI(player);
        }
        if(player.hasPermission("empirepet.mod")){
            GUIChooser.openGUI(player);
        }
        if(player.hasPermission("empirepet.snrmod")){
            GUIChooser.openGUI(player);
        }
        if(player.hasPermission("empirepet.vip")){
            GUIChooser.openGUI(player);
        }
        if(player.hasPermission("empirepet.headadmin")){
            GUIChooser.openGUI(player);
        }
        if(player.hasPermission("empirepet.owner")){
            GUIChooser.openGUI(player);
        }
        return true;
    }

}
