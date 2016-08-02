package net.glowstone.api.net.event;

import net.glowstone.api.net.IMessageClientbound;
import org.bukkit.event.HandlerList;

public class MessageSendEvent<M extends IMessageClientbound> extends MessageEvent {

    private static final HandlerList handlers = new HandlerList();
    private M message;

    public MessageSendEvent(M message) {
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
