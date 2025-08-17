package com.mineymods.core;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KitManager implements CommandExecutor {

    private final Main plugin;

    public KitManager(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("kit")) {
            // simple starter kit logic
            player.sendMessage("You claimed the starter kit!");
        }
        return true;
    }
}
