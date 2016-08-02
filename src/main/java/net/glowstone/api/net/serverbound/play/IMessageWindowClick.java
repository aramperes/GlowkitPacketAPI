package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageServerbound;
import org.bukkit.inventory.ItemStack;

public interface IMessageWindowClick<S extends Session> extends IMessageServerbound<S, IMessageWindowClick> {

    int getId();
    void setId(int id);

    int getSlot();
    void setSlot(int slot);

    int getButton();
    void setButton(int button);

    int getTransaction();
    void setTransaction(int transaction);

    int getMode();
    void setMode(int mode);

    ItemStack getItem();
    void setItem(ItemStack item);

}
