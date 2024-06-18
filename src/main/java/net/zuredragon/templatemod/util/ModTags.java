
package net.zuredragon.templatemod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.zuredragon.templatemod.TemplateMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SILVERPICKAXE_MINEABLEBLOCKS =
                createTag("silverpickaxe_mineable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(TemplateMod.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(TemplateMod.MOD_ID, name));
        }
    }
}
