package com.mineymods.core;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public KitManager kitManager;
    public SpawnManager spawnManager;
    public MessagesManager messagesManager;
    public DailyClaimManager dailyClaimManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        kitManager = new KitManager(this);
        spawnManager = new SpawnManager(this);
        messagesManager = new MessagesManager(this);
        dailyClaimManager = new DailyClaimManager(this);

        getCommand("spawn").setExecutor(spawnManager);
        getCommand("kit").setExecutor(kitManager);

        getLogger().info("MineyMods-Core enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MineyMods-Core disabled!");
    }
}
