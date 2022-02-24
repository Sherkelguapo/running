package dev.pogodemon.world;

import dev.pogodemon.entities.HazardRespawnPoint;
import dev.pogodemon.entities.PlayerSlash;
import dev.pogodemon.entities.creatures.Crawlid;
import dev.pogodemon.entities.creatures.Vengefly;
import dev.pogodemon.entities.objects.GeoDeposit;
import dev.pogodemon.entities.objects.SpikesLarge;
import dev.pogodemon.entities.objects.SpikesMedium;
import dev.pogodemon.utils.Handler;

public class WorldLoader
{
    private Handler handler;
    public WorldLoader(Handler handler)
    {
        this.handler = handler;
    }

    public World KingsPass()
    {
        World kings_pass = new World(handler,"kings_pass_collision_map.png", 2000, 4680);
        handler.setWorld(kings_pass);

        kings_pass.spawnEntity(new Vengefly(handler, 6890, 3232, 500, 1500));
        kings_pass.spawnEntity(new Vengefly(handler, 4900, 2700, 500, 1500));
        kings_pass.spawnEntity(new Vengefly(handler, 6658, 2300, 500, 1500));

        kings_pass.spawnEntity(new GeoDeposit(handler, 950, 4800, 0));
        kings_pass.spawnEntity(new GeoDeposit(handler, 12245, 5200, 0));
        kings_pass.spawnEntity(new GeoDeposit(handler, 8230, 1720, 0));
        kings_pass.spawnEntity(new GeoDeposit(handler, 4821, 2280, 0));

        kings_pass.spawnEntity(new Crawlid(handler, 7350, 4680, 6924, 8354));
        kings_pass.spawnEntity(new Crawlid(handler, 8733, 4680, 8673, 9668));
        kings_pass.spawnEntity(new Crawlid(handler, 11645, 5100, 10600, 11833));
        kings_pass.spawnEntity(new Crawlid(handler, 6438, 1200, 6032, 6793));

        kings_pass.spawnEntity(new SpikesLarge(handler, 960, 3300, 0));

        kings_pass.spawnEntity(new SpikesLarge(handler, 640, 2250, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 700, 2250, 0));

        kings_pass.spawnEntity(new SpikesLarge(handler, 1000, 1800, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 1139, 1800, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 1278, 1800, 0));

        kings_pass.spawnEntity(new SpikesLarge(handler, 700, 950, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 620, 950, 0));

        kings_pass.spawnEntity(new SpikesMedium(handler, 12560, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 12640, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 12720, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 12800, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 12880, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 12960, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 13040, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 13120, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 13200, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 13280, 3220, 0));

        kings_pass.spawnEntity(new SpikesMedium(handler, 13520, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 13600, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 13680, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 13760, 3220, 0));
        kings_pass.spawnEntity(new SpikesMedium(handler, 13840, 3220, 0));

        kings_pass.spawnEntity(new SpikesLarge(handler, 10520, 3140, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 10650, 3140, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 10780, 3140, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 10910, 3140, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 11040, 3140, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 11170, 3140, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 11300, 3140, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 11430, 3140, 0));

        kings_pass.spawnEntity(new SpikesLarge(handler, 4640, 3840, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 4770, 3840, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 4900, 3840, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 5030, 3840, 0));
        kings_pass.spawnEntity(new SpikesLarge(handler, 5080, 3840, 0));

        kings_pass.spawnEntity(new HazardRespawnPoint(handler, 800, 4480, 500, 400, 1000, 4751));
        kings_pass.spawnEntity(new HazardRespawnPoint(handler, 3000, 4480, 500, 400, 3200, 4751));
        kings_pass.spawnEntity(new HazardRespawnPoint(handler, 5420, 3560, 500, 240, 5517, 3671));
        kings_pass.spawnEntity(new HazardRespawnPoint(handler, 9760, 2080, 320, 600, 9886, 2551));
        kings_pass.spawnEntity(new HazardRespawnPoint(handler, 11600, 2880, 900, 320, 12069, 3071));
        kings_pass.spawnEntity(new HazardRespawnPoint(handler, 13360, 2880, 160, 320, 13420, 3071));
        kings_pass.spawnEntity(new HazardRespawnPoint(handler, 13920, 2880, 320, 320, 14063, 3071));
        kings_pass.spawnEntity(new HazardRespawnPoint(handler, 11720, 1880, 440, 320, 12025, 2071));

        kings_pass.spawnEntity(new PlayerSlash(handler, handler.getWorld().getEntityManager().getPlayer().getX(), handler.getWorld().getEntityManager().getPlayer().getY()));

        return kings_pass;
    }
}
