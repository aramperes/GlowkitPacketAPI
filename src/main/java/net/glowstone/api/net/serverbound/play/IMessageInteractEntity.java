package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageServerbound;

public interface IMessageInteractEntity<S extends Session> extends IMessageServerbound<S, IMessageInteractEntity> {

    int getId();
    void setId(int id);

    int getAction();
    void setAction(int action);

    float getTargetX();
    void setTargetX(float targetX);

    float getTargetY();
    void setTargetY(float targetY);

    float getTargetZ();
    void setTargetZ(float targetZ);

    int getHand();
    void setHand(int hand);

}
