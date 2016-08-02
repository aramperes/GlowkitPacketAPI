package net.glowstone.api.net;

import net.glowstone.api.net.common.play.IMessageCloseWindow;
import net.glowstone.api.net.event.MessageSendEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class test implements Listener {

    @EventHandler
    public void onMessage(MessageSendEvent<IMessageCloseWindow> event) {

    }
}
