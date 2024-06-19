package net.zuredragon.templatemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zuredragon.templatemod.TemplateMod;

public class ModItems {

    public static final Item SILVERINGOT = registerItem("silveringot", new Item(new FabricItemSettings()));
    public static final Item RAWSILVER = registerItem("rawsilver", new Item(new FabricItemSettings()));
    public static final Item SILVERNUGGET = registerItem("silvernugget", new Item(new FabricItemSettings()));

    public static final Item SILVERAXE = registerItem("silveraxe",
            new AxeItem(ModToolMaterial.SILVERINGOT, 8f, -2.6f, new FabricItemSettings()));
    public static final Item SILVERHOE = registerItem("silverhoe",
            new HoeItem(ModToolMaterial.SILVERINGOT, 0, -0.5f, new FabricItemSettings()));
    public static final Item SILVEPICKAXE = registerItem("silverpickaxe",
            new PickaxeItem(ModToolMaterial.SILVERINGOT, 3, -2.3f, new FabricItemSettings()));
    public static final Item SILVERSHOVEL = registerItem("silvershovel",
            new ShovelItem(ModToolMaterial.SILVERINGOT, 3.5f, -2.5f, new FabricItemSettings()));
    public static final Item SILVERSWORD = registerItem("silversword",
            new SwordItem(ModToolMaterial.SILVERINGOT, 5, -1.9f, new FabricItemSettings()));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SILVERINGOT);
        entries.add(RAWSILVER);
        entries.add(SILVERNUGGET);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TemplateMod.MOD_ID, name), item);
    }

    public  static  void registerModItems() {
        TemplateMod.LOGGER.info("Registering Mod Items for " + TemplateMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
