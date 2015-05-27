/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.zezombini.powerbroadcast.commande;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author zombini
 */
public class PBEdit implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("powerbroadcast")){
            
        }
        return true;
    }
    
    private void addEntre(){
        
    }
    
    private void supprEntre(){
    
    }
    
    private void editEntre(){
        
    }
}
