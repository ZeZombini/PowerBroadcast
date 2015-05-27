/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.zezombini.powerbroadcast;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author zombini
 */
    public class PowerBroadcast extends JavaPlugin {
        @Override
        public void onEnable(){
            saveDefaultConfig();
            getLogger().info("Plugin démarré !");
        }
        
        @Override
        public void onDisable(){
            getLogger().info("Plugin éteint !");
        }
        
    }
