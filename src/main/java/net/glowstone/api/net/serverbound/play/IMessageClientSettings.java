package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageServerbound;

public interface IMessageClientSettings<S extends Session> extends IMessageServerbound<S, IMessageClientSettings> {

    String getLocale();
    void setLocale(String locale);

    int getViewDistance();
    void setViewDistance(int viewDistance);

    int getChatFlags();
    void setChatFlags(int chatFlags);

    boolean isChatColors();
    void setChatColors(boolean chatColors);

    int getSkinFlags();
    void setSkinFlags(int skinFlags);

    int getHand();
    void setHand(int hand);

}
