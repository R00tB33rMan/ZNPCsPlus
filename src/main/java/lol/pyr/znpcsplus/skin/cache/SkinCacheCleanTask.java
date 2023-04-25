package lol.pyr.znpcsplus.skin.cache;

import lol.pyr.znpcsplus.ZNPCsPlus;
import org.bukkit.scheduler.BukkitRunnable;

public class SkinCacheCleanTask extends BukkitRunnable {
    public SkinCacheCleanTask(ZNPCsPlus plugin) {
        runTaskTimerAsynchronously(plugin, 1200, 1200);
    }

    @Override
    public void run() {
        SkinCache.cleanCache();
    }
}
