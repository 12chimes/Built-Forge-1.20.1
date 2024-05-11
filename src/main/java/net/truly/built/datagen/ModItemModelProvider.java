package net.truly.built.datagen;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;
import net.truly.built.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Built.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BUILT);

        evenSimplerBlockItem(ModBlocks.OAK_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.OAK_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.SPRUCE_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.SPRUCE_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.BIRCH_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.BIRCH_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.JUNGLE_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.JUNGLE_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.ACACIA_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.ACACIA_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.DARK_OAK_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.DARK_OAK_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.MANGROVE_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.MANGROVE_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.CHERRY_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.CHERRY_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.BAMBOO_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.BAMBOO_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.CRIMSON_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.CRIMSON_SHAKES_SLAB);

        evenSimplerBlockItem(ModBlocks.WARPED_SHAKES_STAIRS);
        evenSimplerBlockItem(ModBlocks.WARPED_SHAKES_SLAB);



        evenSimplerBlockItem(ModBlocks.CHUNKY_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.CHUNKY_BRICK_SLAB);
        wallItem(ModBlocks.CHUNKY_BRICK_WALL, ModBlocks.CHUNKY_BRICKS);

        evenSimplerBlockItem(ModBlocks.CUT_COBBLESTONE_STAIRS);
        evenSimplerBlockItem(ModBlocks.CUT_COBBLESTONE_SLAB);
        wallItem(ModBlocks.CUT_COBBLESTONE_WALL, ModBlocks.CUT_COBBLESTONE);

        evenSimplerBlockItem(ModBlocks.MOSSY_CUT_COBBLESTONE_STAIRS);
        evenSimplerBlockItem(ModBlocks.MOSSY_CUT_COBBLESTONE_SLAB);
        wallItem(ModBlocks.MOSSY_CUT_COBBLESTONE_WALL, ModBlocks.MOSSY_CUT_COBBLESTONE);

        evenSimplerBlockItem(ModBlocks.CARVED_STONE);
        evenSimplerBlockItem(ModBlocks.CARVED_GRANITE);
        evenSimplerBlockItem(ModBlocks.CARVED_DIORITE);
        evenSimplerBlockItem(ModBlocks.CARVED_ANDESITE);

        evenSimplerBlockItem(ModBlocks.SUGARCRETE_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.SUGARCRETE_BRICK_SLAB);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Built.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Built.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Built.MOD_ID, "block/"
                        + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
}