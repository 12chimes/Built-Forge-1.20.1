package net.truly.built.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Built.MOD_ID);

    public static final RegistryObject<BlockEntityType<MudPotBlockEntity>> MUD_POT_BE =
            BLOCK_ENTITIES.register("mud_pot_be", () ->
                    BlockEntityType.Builder.of(MudPotBlockEntity::new,
                            ModBlocks.MUD_POT.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
