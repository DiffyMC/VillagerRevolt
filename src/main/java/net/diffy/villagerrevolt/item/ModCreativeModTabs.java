package net.diffy.villagerrevolt.item;

import net.diffy.villagerrevolt.VillagerRevolt;
import net.diffy.villagerrevolt.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VillagerRevolt.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VILLAGER_REVOLT_TAB = CREATIVE_MODE_TABS.register("villager_revolt_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VILLAGER_ICON.get()))
                    .title(Component.translatable("creativetab.villager_revolt_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Items.VILLAGER_SPAWN_EGG);
                        pOutput.accept(ModItems.VILLAGER_STICK.get());
                        pOutput.accept(ModBlocks.VILLAGER_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
