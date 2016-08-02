package net.glowstone.api.net;

import com.flowpowered.network.session.Session;

public interface IMessageServerbound<S extends Session, M extends IMessageServerbound> extends IMessageBase<M>, IMessageHandler<S, M> {

    @Override
    default MessageHandlerSide getHandlerSide() {
        return MessageHandlerSide.SERVERBOUND;
    }

}
