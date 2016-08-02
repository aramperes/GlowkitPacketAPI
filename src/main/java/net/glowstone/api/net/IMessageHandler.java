package net.glowstone.api.net;

import com.flowpowered.network.Message;
import com.flowpowered.network.MessageHandler;
import com.flowpowered.network.session.Session;

public interface IMessageHandler<S extends Session, M extends IMessageHandler> extends Message, MessageHandler<S, M> {

}
