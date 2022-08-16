package fr.pixfri.pixfribackpackmod.item;

import fr.pixfri.pixfribackpackmod.PixfriBackpackMod;
import fr.pixfri.pixfribackpackmod.item.custom.BackpackItem;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registry.ITEM_REGISTRY,
            PixfriBackpackMod.MODID);

    public static final RegistryObject<Item> BACKPACK = ITEMS.register("backpack",
            () -> new BackpackItem(new Item.Properties().tab(ModCreativeModeTab.PIXFRIBACKPACKMOD_TAB)
                    .fireResistant().rarity(Rarity.COMMON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
