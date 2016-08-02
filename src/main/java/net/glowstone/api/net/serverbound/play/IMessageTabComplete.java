package net.glowstone.api.net.serverbound.play;

import com.flowpowered.network.session.Session;
import net.glowstone.api.net.IMessageServerbound;
import org.bukkit.util.BlockVector;

public interface IMessageTabComplete<S extends Session> extends IMessageServerbound<S, IMessageTabComplete> {

    String getText();
    void setText(String text);

    boolean isAssumeCommand();
    void setAssumeCommand(boolean assumeCommand);

    BlockVector getLocation();
    void setBlockVector(BlockVector location);

}
