package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;

public interface IMessagePlayerPositionLook<S extends Session> extends IMessagePlayerUpdate<S, IMessagePlayerPositionLook> {

    double getX();
    void setX(double x);

    double getY();
    void setY(double y);

    double getZ();
    void setZ(double z);

    float getYaw();
    void setYaw(float yaw);

    float getPitch();
    void setPitch(float pitch);

}
