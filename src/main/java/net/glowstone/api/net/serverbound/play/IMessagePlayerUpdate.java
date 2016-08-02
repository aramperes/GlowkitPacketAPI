package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageServerbound;

public interface IMessagePlayerUpdate<S extends Session, M extends IMessagePlayerUpdate> extends IMessageServerbound<S, M> {

    boolean isOnGround();
    void setOnGround(boolean onGround);

    default void update() {
        // do nothing
    }

    default boolean moved() {
        return false;
    }

}
