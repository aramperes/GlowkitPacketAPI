package net.glowstone.api.net.common;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageClientbound;
import net.glowstone.api.net.IMessageServerbound;
import net.glowstone.api.net.MessageHandlerSide;

public interface IMessageCommon<S extends Session, M extends IMessageCommon> extends IMessageServerbound<S, M>, IMessageClientbound<S, M> {
    @Override
    default MessageHandlerSide getHandlerSide() {
        return null;
    }
}
