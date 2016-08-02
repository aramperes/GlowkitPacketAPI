package net.glowstone.api.net.common.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.common.IMessageCommon;

public interface IMessageTransaction<S extends Session> extends IMessageCommon<S, IMessageTransaction> {

    int getId();
    void setId(int id);

    int getTransaction();
    void setTransaction(int transaction);

    boolean isAccepted();
    void setAccepted(boolean accepted);

}
