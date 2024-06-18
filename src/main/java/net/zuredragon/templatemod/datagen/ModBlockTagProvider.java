package net.zuredragon.templatemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.zuredragon.templatemod.block.ModBlocks;
import net.zuredragon.templatemod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
     getOrCreateTagBuilder(ModTags.Blocks.SILVERPICKAXE_MINEABLEBLOCKS)
             .add(ModBlocks.SILVERORE)
             .add(ModBlocks.SILVERBLOCK)
             .add(ModBlocks.RAWSILVERBLOCK)
             .forceAddTag(BlockTags.GOLD_ORES)
             .forceAddTag(BlockTags.EMERALD_ORES)
             .forceAddTag(BlockTags.IRON_ORES)
             .forceAddTag(BlockTags.REDSTONE_ORES)
             .forceAddTag(BlockTags.DIAMOND_ORES)
             .forceAddTag(BlockTags.LAPIS_ORES)
             .forceAddTag(BlockTags.COPPER_ORES)
             .forceAddTag(BlockTags.COAL_ORES);

     getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
             .add(ModBlocks.SILVERORE)
             .add(ModBlocks.DEEPSLATESILVERORE)
             .add(ModBlocks.SILVERBLOCK)
             .add(ModBlocks.RAWSILVERBLOCK);

     getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
             .add(ModBlocks.SILVERORE)
             .add(ModBlocks.DEEPSLATESILVERORE)
             .add(ModBlocks.SILVERBLOCK)
             .add(ModBlocks.RAWSILVERBLOCK);
    }
}
