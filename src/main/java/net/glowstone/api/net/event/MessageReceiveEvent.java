package net.glowstone.api.net.event;

import net.glowstone.api.net.IMessageServerbound;
import org.bukkit.event.HandlerList;

public class MessageReceiveEvent<M extends IMessageServerbound> extends MessageEvent {

    private static final HandlerList handlers = new HandlerList();
    private M message;

    public MessageReceiveEvent(M message) {
        this.message = message;
    }

    public M getMessage() {
        return message;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
