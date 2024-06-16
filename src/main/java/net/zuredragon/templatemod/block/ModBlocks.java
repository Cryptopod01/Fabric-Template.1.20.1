package net.zuredragon.templatemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.zuredragon.templatemod.TemplateMod;

public class ModBlocks {
    public static final Block RAWSILVERBLOCK = registerBlock("rawsilverblock",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK).mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block SILVERBLOCK = registerBlock("silverblock",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).mapColor(MapColor.TERRACOTTA_CYAN)));

    public static final Block SILVERORE = registerBlock("silverore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE).strength(3.0f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATESILVERORE = registerBlock("deepslatesilverore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE).strength(4.0f), UniformIntProvider.create(2, 5)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TemplateMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TemplateMod.LOGGER.info("Registering ModBlocks for " + TemplateMod.MOD_ID);
    }
}
