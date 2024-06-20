package net.zuredragon.templatemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.zuredragon.templatemod.block.ModBlocks;
import net.zuredragon.templatemod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAWSILVERBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVERBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATESILVERORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVERORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAWSILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVERINGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVERNUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVERAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVERHOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVEPICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVERSHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVERSWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVERHELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVERCHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVERLEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVERBOOTS));
    }
}
