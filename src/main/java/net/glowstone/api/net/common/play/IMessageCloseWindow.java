package net.glowstone.api.net.common.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.common.IMessageCommon;

public interface IMessageCloseWindow<S extends Session> extends IMessageCommon<S, IMessageCloseWindow> {

    int getId();
    void setId(int id);

}
