package fr.pixfri.pixfribackpackmod.item;

import fr.pixfri.pixfribackpackmod.PixfriBackpackMod;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registry.ITEM_REGISTRY,
            PixfriBackpackMod.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
