package net.glowstone.api.net.common;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.MessageHandlerSide;

public abstract class AbstractMessageCommon<S extends Session, M extends IMessageCommon> implements IMessageCommon<S, M> {

    private MessageHandlerSide side;

    public AbstractMessageCommon(MessageHandlerSide side) {
        this.side = side;
    }

    @Override
    public MessageHandlerSide getHandlerSide() {
        return side;
    }
}
