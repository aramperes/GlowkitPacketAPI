package net.glowstone.api.net;

import com.flowpowered.network.Codec;
import com.flowpowered.network.Message;

public interface IMessageCodec<T extends Message> extends Codec<T> {
}
