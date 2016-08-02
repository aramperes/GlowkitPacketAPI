package net.glowstone.api.net.common.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.common.IMessageCommon;

public interface IMessagePing<S extends Session> extends IMessageCommon<S, IMessagePing> {

    int getPingId();
    void setPingId(int pingId);

}
