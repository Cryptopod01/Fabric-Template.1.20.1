package net.zuredragon.templatemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
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
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SILVERINGOT, RecipeCategory.MISC,
                ModItems.SILVERNUGGET);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERAXE, 1)
                .pattern("SS#")
                .pattern("S5#")
                .pattern("#5#")
                .input('S', ModItems.SILVERINGOT)
                .input('5', Items.STICK)
                .criterion(hasItem(ModItems.SILVERINGOT), conditionsFromItem(ModItems.SILVERINGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.SILVERAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERHOE, 1)
                .pattern("SS#")
                .pattern("#5#")
                .pattern("#5#")
                .input('S', ModItems.SILVERINGOT)
                .input('5', Items.STICK)
                .criterion(hasItem(ModItems.SILVERINGOT), conditionsFromItem(ModItems.SILVERINGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.SILVERHOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVEPICKAXE, 1)
                .pattern("SSS")
                .pattern("#5#")
                .pattern("#5#")
                .input('S', ModItems.SILVERINGOT)
                .input('5', Items.STICK)
                .criterion(hasItem(ModItems.SILVERINGOT), conditionsFromItem(ModItems.SILVERINGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.SILVEPICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERSHOVEL, 1)
                .pattern("#S#")
                .pattern("#5#")
                .pattern("#5#")
                .input('S', ModItems.SILVERINGOT)
                .input('5', Items.STICK)
                .criterion(hasItem(ModItems.SILVERINGOT), conditionsFromItem(ModItems.SILVERINGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.SILVERSHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERSWORD, 1)
                .pattern("#S#")
                .pattern("#S#")
                .pattern("#5#")
                .input('S', ModItems.SILVERINGOT)
                .input('5', Items.STICK)
                .criterion(hasItem(ModItems.SILVERINGOT), conditionsFromItem(ModItems.SILVERINGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.SILVERSWORD)));

    }
}
