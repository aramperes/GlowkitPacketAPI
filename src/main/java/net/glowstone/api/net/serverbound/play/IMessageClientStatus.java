package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageServerbound;

public interface IMessageClientStatus<S extends Session> extends IMessageServerbound<S, IMessageClientStatus> {

    int RESPAWN = 0;
    int REQUEST_STATS = 1;
    int OPEN_INVENTORY = 2;

    int getAction();
    void setAction(int action);
}
