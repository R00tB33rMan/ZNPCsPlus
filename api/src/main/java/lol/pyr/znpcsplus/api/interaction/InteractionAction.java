package lol.pyr.znpcsplus.api.interaction;

import org.bukkit.entity.Player;

import java.util.UUID;

public abstract class InteractionAction {
    private final UUID id;
    private final long cooldown;
    private final long delay;
    private final InteractionType interactionType;

    protected InteractionAction(long cooldown, long delay, InteractionType interactionType) {
        this.interactionType = interactionType;
        this.id = UUID.randomUUID();
        this.cooldown = cooldown;
        this.delay = delay;
    }

    public UUID getUuid() {
        return id;
    }

    public long getCooldown() {
        return cooldown;
    }

    public long getDelay() {
        return delay;
    }

    public InteractionType getInteractionType() {
        return interactionType;
    }

    public abstract void run(Player player);
}
