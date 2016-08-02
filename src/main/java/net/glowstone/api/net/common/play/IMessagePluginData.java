package net.glowstone.api.net.common.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.common.IMessageCommon;

public interface IMessagePluginData<S extends Session> extends IMessageCommon<S, IMessagePluginData> {

    String getChannel();
    void setChannel(String channel);

    byte[] getData();
    void setData();

}
