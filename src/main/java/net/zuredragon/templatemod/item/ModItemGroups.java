package net.zuredragon.templatemod.item;

import net.zuredragon.templatemod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zuredragon.templatemod.TemplateMod;

public class ModItemGroups {
    public static final ItemGroup SILVERINGOT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TemplateMod.MOD_ID, "silveringot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.template"))
                    .icon(() -> new ItemStack(ModItems.SILVERINGOT)).entries((displayContext, entries) -> {
                    entries.add(ModItems.RAWSILVER);
                    entries.add(ModItems.SILVERINGOT);
                    entries.add(ModItems.SILVERNUGGET);

                    entries.add(ModItems.SILVERAXE);
                    entries.add(ModItems.SILVERHOE);
                    entries.add(ModItems.SILVEPICKAXE);
                    entries.add(ModItems.SILVERSHOVEL);
                    entries.add(ModItems.SILVERSWORD);

                    entries.add(ModItems.SILVERHELMET);
                    entries.add(ModItems.SILVERCHESTPLATE);
                    entries.add(ModItems.SILVERLEGGINGS);
                    entries.add(ModItems.SILVERBOOTS);

                    entries.add(ModBlocks.RAWSILVERBLOCK);
                    entries.add(ModBlocks.SILVERBLOCK);
                    entries.add(ModBlocks.DEEPSLATESILVERORE);
                    entries.add(ModBlocks.SILVERORE);


                    }).build());

    public static void registerItemGroups() {
        TemplateMod.LOGGER.info("Registering Item Groups for " + TemplateMod.MOD_ID);
    }
}
