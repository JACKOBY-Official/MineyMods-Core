package com.mineymods.core;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnManager implements CommandExecutor {

    private final Main plugin;
    private final int delay;

    public SpawnManager(Main plugin) {
        this.plugin = plugin;
        this.delay = plugin.getConfig().getInt("spawn-delay", 3);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;

        // teleport to spawn with delay
        Location spawn = plugin.getServer().getWorlds().get(0).getSpawnLocation();
        player.sendMessage("Teleporting to spawn in " + delay + " seconds...");
        player.teleport(spawn); // simplified, add delay and cancel on movement later
        return true;
    }
}
