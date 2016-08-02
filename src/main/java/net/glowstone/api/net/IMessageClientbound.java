package net.glowstone.api.net;

import com.flowpowered.network.session.Session;

public interface IMessageClientbound<S extends Session, M extends IMessageClientbound> extends IMessageBase<M>, IMessageSender<M> {

    @Override
    default MessageHandlerSide getHandlerSide() {
        return MessageHandlerSide.CLIENTBOUND;
    }

}
