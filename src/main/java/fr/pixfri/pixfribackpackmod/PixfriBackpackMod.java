package fr.pixfri.pixfribackpackmod;

import com.mojang.logging.LogUtils;
import fr.pixfri.pixfribackpackmod.event.ModEventBusEvents;
import fr.pixfri.pixfribackpackmod.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;

@Mod(PixfriBackpackMod.MODID)
public class PixfriBackpackMod
{
    public static final String MODID = "pixfribackpackmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PixfriBackpackMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(ModEventBusEvents::commonSetup);
        modEventBus.addListener(this::enqueueIMC);

        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE,
                () -> SlotTypePreset.BACK.getMessageBuilder().build());
    }
}
