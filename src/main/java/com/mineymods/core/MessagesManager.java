package com.mineymods.core;

import org.bukkit.plugin.java.JavaPlugin;

public class MessagesManager {

    private final Main plugin;

    public MessagesManager(Main plugin) {
        this.plugin = plugin;
        // load messages.yml here
    }

    public void reloadMessages() {
        plugin.reloadConfig(); // you can load separate messages.yml later
    }
}
