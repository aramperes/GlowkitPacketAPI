package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;

public interface IMessagePlayerPosition<S extends Session> extends IMessagePlayerUpdate<S, IMessagePlayerPosition> {

    double getX();
    void setX(double x);

    double getY();
    void setY(double y);

    double getZ();
    void setZ(double z);

}
