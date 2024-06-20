package net.zuredragon.templatemod.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.zuredragon.templatemod.item.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModLootTableModifier {
    private static Identifier ABANDONED_MINESHAFT_ID =
            new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static Identifier BURIED_TREASURE_ID =
            new Identifier("minecraft", "chests/buried_treasure");
    private static Identifier DESERT_PYRAMID_ID =
            new Identifier("minecraft", "chests/desert_pyramid");
    private static Identifier END_CITY_TREASURE_ID =
            new Identifier("minecraft", "chests/end_city_treasure");
    private static Identifier IGLOO_CHEST_ID =
            new Identifier("minecraft", "chests/igloo_chest");
    private static Identifier JUNGLE_TEMPLE_ID =
            new Identifier("minecraft", "chests/jungle_temple");
    private static Identifier PILLAGER_OUTPOST_ID =
            new Identifier("minecraft", "chests/pillager_outpost");
    private static Identifier SHIPWRECK_MAP_ID =
            new Identifier("minecraft", "chests/shipwreck_map");
    private static Identifier SHIPWRECK_SUPPLY_ID =
            new Identifier("minecraft", "chests/shipwreck_supply");
    private static Identifier SHIPWRECK_TREASURE_ID =
            new Identifier("minecraft", "chests/shipwreck_treasure");
    private static Identifier SIMPLE_DUNGEON_ID =
            new Identifier("minecraft", "chests/simple_dungeon");
    private static Identifier STRONGHOLD_CORRIDOR_ID =
            new Identifier("minecraft", "chests/stronghold_corridor");
    private static Identifier STRONGHOLD_CROSSING_ID =
            new Identifier("minecraft", "chests/stronghold_crossing");
    private static Identifier STRONGHOLD_LIBRARY_ID =
            new Identifier("minecraft", "chests/stronghold_library");
    private static Identifier UNDERWATER_RUIN_BIG_ID =
            new Identifier("minecraft", "chests/underwater_ruin_big");
    private static Identifier UNDERWATER_RUIN_SMALL_ID =
            new Identifier("minecraft", "chests/underwater_ruin_small");
    private static Identifier WOODLAND_MANSION_ID =
            new Identifier("minecraft", "chests/woodland_mansion");
    private static Identifier VILLAGE_ARMORER_ID =
            new Identifier("minecraft", "chests/village_armorer");
    private static Identifier VILLAGE_FLETCHER_ID =
            new Identifier("minecraft", "chests/village_fletcher");
    private static Identifier VILLAGE_SHEPHERD_ID =
            new Identifier("minecraft", "chests/village_shepherd");
    private static Identifier VILLAGE_TEMPLE_ID =
            new Identifier("minecraft", "chests/village_temple");
    private static Identifier VILLAGE_TOOLSMITH_ID =
            new Identifier("minecraft", "chests/village_toolsmith");
    private static Identifier VILLAGE_WEAPONSMITH_ID =
            new Identifier("minecraft", "chests/village_weaponsmith");

    private static Identifier SUSPICIOUS_SAND_ID =
            new Identifier("minecraft", "archaeology/desert_pyramid");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (DESERT_PYRAMID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (END_CITY_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (IGLOO_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (PILLAGER_OUTPOST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (SHIPWRECK_MAP_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (SHIPWRECK_SUPPLY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (SHIPWRECK_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (STRONGHOLD_CROSSING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (STRONGHOLD_LIBRARY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (UNDERWATER_RUIN_BIG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (UNDERWATER_RUIN_SMALL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (VILLAGE_ARMORER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (VILLAGE_FLETCHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (VILLAGE_SHEPHERD_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (VILLAGE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (VILLAGE_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.RAWSILVER))
                        .with(ItemEntry.builder(ModItems.SILVERINGOT))
                        .with(ItemEntry.builder(ModItems.SILVERNUGGET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

        });

        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if (SUSPICIOUS_SAND_ID.equals(id)) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModItems.RAWSILVER).build());
                entries.add(ItemEntry.builder(ModItems.SILVERINGOT).build());
                entries.add(ItemEntry.builder(ModItems.SILVERNUGGET).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();

            }


            return null;
        });
    }
}
