package fr.pixfri.pixfribackpackmod.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

@SuppressWarnings("deprecation")
public class BackpackItem extends Item implements ICurioItem {

    public BackpackItem(Properties properties) {
        super(properties);
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        Player player = (Player) livingEntity;

        if(!player.level.isClientSide()) {

        }

        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();
        }

        return super.useOn(pContext);
    }
}
