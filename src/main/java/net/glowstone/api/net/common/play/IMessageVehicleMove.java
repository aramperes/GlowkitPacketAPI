package net.glowstone.api.net.common.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.common.IMessageCommon;

public interface IMessageVehicleMove<S extends Session> extends IMessageCommon<S, IMessageVehicleMove> {

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
