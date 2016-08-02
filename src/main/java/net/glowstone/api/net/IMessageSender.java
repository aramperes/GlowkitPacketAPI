package net.glowstone.api.net;

import com.flowpowered.network.Message;

public interface IMessageSender<M extends Message> extends Message {

    void send(M message);

}
