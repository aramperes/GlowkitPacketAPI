package net.glowstone.api.net.event;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

public abstract class MessageEvent extends Event implements Cancellable {

    private boolean cancelled;

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
