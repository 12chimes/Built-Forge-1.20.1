package net.truly.built.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Built.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BUILT_TAB = CREATIVE_MODE_TABS.register("built_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BUILT.get()))
                    .title(Component.translatable("creativetab.built_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {

                            pOutput.accept(block.get());

                        }

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}