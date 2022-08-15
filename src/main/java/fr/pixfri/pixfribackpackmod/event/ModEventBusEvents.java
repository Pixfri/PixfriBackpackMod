package fr.pixfri.pixfribackpackmod.event;

import fr.pixfri.pixfribackpackmod.PixfriBackpackMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = PixfriBackpackMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    public static void commonSetup(final FMLCommonSetupEvent event)
    {
        PixfriBackpackMod.LOGGER.info("Setting Up Common Event Bus for : " + PixfriBackpackMod.MODID);
    }
}
