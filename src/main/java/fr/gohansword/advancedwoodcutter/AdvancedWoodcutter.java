package fr.gohansword.advancedwoodcutter;

import fr.gohansword.advancedwoodcutter.Commands.MenuCmd;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedWoodcutter extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("woodmenu").setExecutor(new MenuCmd());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
