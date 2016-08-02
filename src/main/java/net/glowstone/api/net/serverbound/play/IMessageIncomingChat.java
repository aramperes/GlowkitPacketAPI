package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageAsyncable;
import net.glowstone.api.net.IMessageServerbound;

public interface IMessageIncomingChat<S extends Session> extends IMessageAsyncable, IMessageServerbound<S, IMessageIncomingChat> {

    String getText();
    void setText(String text);

    @Override
    default boolean isAsync() {
        return true;
    }
}
