package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;

public interface IMessagePlayerLook<S extends Session> extends IMessagePlayerUpdate<S, IMessagePlayerLook> {

    float getYaw();
    void setYaw(float yaw);

    float getPitch();
    void setPitch(float pitch);

}
