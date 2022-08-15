package fr.pixfri.pixfribackpackmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab PIXFRIMOD_TAB = new CreativeModeTab("pixfribackpackmod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.WATER_BUCKET);
        }
    };
}

