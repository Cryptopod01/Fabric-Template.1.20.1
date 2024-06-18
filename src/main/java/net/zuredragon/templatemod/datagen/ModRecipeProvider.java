package net.zuredragon.templatemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.zuredragon.templatemod.block.ModBlocks;
import net.zuredragon.templatemod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVERINGOT_SMELTABLES = List.of(ModItems.RAWSILVER,
            ModBlocks.DEEPSLATESILVERORE, ModBlocks.SILVERORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SILVERINGOT_SMELTABLES, RecipeCategory.MISC, ModItems.SILVERINGOT,
                0.7f, 200, "silveringot");
        offerBlasting(exporter, SILVERINGOT_SMELTABLES, RecipeCategory.MISC, ModItems.SILVERINGOT,
                0.7f, 100, "silveringot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAWSILVER, RecipeCategory.DECORATIONS,
                ModBlocks.RAWSILVERBLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVERINGOT, RecipeCategory.DECORATIONS,
                ModBlocks.SILVERBLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVERNUGGET, RecipeCategory.DECORATIONS,
                ModItems.SILVERINGOT);

    }
}
