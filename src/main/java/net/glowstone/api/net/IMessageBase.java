package net.glowstone.api.net;

public interface IMessageBase<M extends IMessageBase> extends IMessageCodec {

    MessageHandlerSide getHandlerSide();

}

