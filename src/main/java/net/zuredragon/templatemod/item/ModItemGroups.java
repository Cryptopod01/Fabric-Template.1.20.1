package net.zuredragon.templatemod.item;

import block.ModBlocks;
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

                    entries.add(ModBlocks.SILVERORE);
                    entries.add(ModBlocks.RAWSILVERBLOCK);
                    entries.add(ModBlocks.SILVERBLOCK);

                    }).build());

    public static void registerItemGroups() {
        TemplateMod.LOGGER.info("Registering Item Groups for " + TemplateMod.MOD_ID);
    }
}
