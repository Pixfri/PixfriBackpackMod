package fr.pixfri.pixfribackpackmod.event;

import fr.pixfri.pixfribackpackmod.PixfriBackpackMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = PixfriBackpackMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        PixfriBackpackMod.LOGGER.info("Setting Up Client for : " + PixfriBackpackMod.MODID);
    }
}
