package fr.gohansword.advancedwoodcutter.Commands;

import me.mattstudios.mfgui.gui.components.ItemBuilder;
import me.mattstudios.mfgui.gui.guis.Gui;
import me.mattstudios.mfgui.gui.guis.GuiItem;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MenuCmd
        implements CommandExecutor {
    @Override
    public boolean  onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        if(player.hasPermission("awc.use")) {
            Gui menu = new Gui(6, "§f§lWood §b§lMenu");
            GuiItem boutiqueventedebois = ItemBuilder.from(Material.WOODEN_AXE).setName("§3§lBoutique de vente de bois").setLore("§7Cliquez pour ouvrir le magasin", "test").asGuiItem(event -> {
                // Handle your click action here
            });
             GuiItem livraison = ItemBuilder.from(Material.MINECART).setName("§6§lLivraison").setLore("§7Cliquez pour voir les livraisons").asGuiItem(event -> {
                 // Handle your click action here
             });
             GuiItem balance = ItemBuilder.from(Material.ANVIL).setName("§b§lBalance").setLore("§7Cliquez pour voir les balances", "§7Peser et obtenez plus d'argents").asGuiItem(event -> {
                 // Handle your click action here
             });
             GuiItem sac = ItemBuilder.from(Material.ENDER_CHEST).setName("§3§lSac à bois").setLore("§7Cliquez pour ouvrir").asGuiItem(event -> {
                 // Handle your click action here
             });
             GuiItem competence = ItemBuilder.from(Material.NETHER_STAR).setName("§1§lCompétances").setLore("§cProchainement").asGuiItem(event -> {
                 // Handle your click action here
             });
             GuiItem amelioration = ItemBuilder.from(Material.FIREWORK_STAR).setName("§2Améliorations").setLore("§7Améliorations ?").asGuiItem(event -> {
                // Handle your click action here
             });


            menu.setItem(20, boutiqueventedebois);
            menu.setItem(21, livraison);
            menu.setItem(23, balance);
            menu.setItem(24, sac);
            menu.setItem(30, competence);
            menu.setItem(32, amelioration);

            menu.getFiller().fill(new GuiItem(new ItemStack(Material.BLACK_STAINED_GLASS_PANE)));
            menu.open(player);
        }

        return false;
    }
}
