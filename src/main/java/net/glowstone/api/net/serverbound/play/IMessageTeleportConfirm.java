package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageServerbound;

public interface IMessageTeleportConfirm<S extends Session> extends IMessageServerbound<S, IMessageTeleportConfirm> {

    int getTeleportID();

    void setTeleportID(int teleportID);

}
