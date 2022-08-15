package fr.pixfri.pixfribackpackmod.event;

import fr.pixfri.pixfribackpackmod.PixfriBackpackMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PixfriBackpackMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.DEDICATED_SERVER)
public class ModEventBusServerEvents {
    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event)
    {
        PixfriBackpackMod.LOGGER.info("Starting Server Event Bus for : " + PixfriBackpackMod.MODID);
    }
}
