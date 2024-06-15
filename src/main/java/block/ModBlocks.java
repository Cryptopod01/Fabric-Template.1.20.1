package block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zuredragon.templatemod.TemplateMod;

public class ModBlocks {
    public static final Block SILVERORE = registerBlock("silverore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).mapColor(MapColor.STONE_GRAY)));
    public static final Block RAWSILVERBLOCK = registerBlock("rawsilverblock",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block SILVERBLOCK = registerBlock("silverblock",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_CYAN)));

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
