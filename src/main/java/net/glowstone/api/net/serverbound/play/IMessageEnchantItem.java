package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageServerbound;

public interface IMessageEnchantItem<S extends Session> extends IMessageServerbound<S, IMessageEnchantItem> {

    int getWindow();
    void setWindow(int window);

    int getEnchantment();
    void setEnchantment(int enchantment);

}
