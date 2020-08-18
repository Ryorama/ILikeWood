package yamahari.ilikewood.provider;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import yamahari.ilikewood.data.tag.ILikeWoodItemTags;
import yamahari.ilikewood.registry.WoodenItems;
import yamahari.ilikewood.util.WoodenObjectType;
import yamahari.ilikewood.util.WoodenTieredObjectType;

public final class ILikeWoodItemTagsProvider extends ItemTagsProvider {
    public ILikeWoodItemTagsProvider(final DataGenerator generator, ILikeWoodBlockTagsProvider blockTagsProvider) {
        super(generator, blockTagsProvider);
    }

    private void registerTag(ITag.INamedTag<Item> tag, WoodenObjectType blocktype) {
        this.getOrCreateBuilder(tag).add(WoodenItems.getItems(blocktype).toArray(Item[]::new));
    }

    private void registerTag(ITag.INamedTag<Item> tag, WoodenTieredObjectType blocktype) {
        this.getOrCreateBuilder(tag).add(WoodenItems.getTieredItems(blocktype).toArray(Item[]::new));
    }

    @Override
    protected void registerTags() {
        registerTag(ILikeWoodItemTags.BARRELS, WoodenObjectType.BARREL);
        registerTag(ILikeWoodItemTags.CHESTS, WoodenObjectType.CHEST);
        registerTag(ILikeWoodItemTags.COMPOSTER, WoodenObjectType.COMPOSTER);
        registerTag(ILikeWoodItemTags.BOOKSHELFS, WoodenObjectType.BOOKSHELF);
        registerTag(ILikeWoodItemTags.PANELS_SLABS, WoodenObjectType.SLAB);
        registerTag(ILikeWoodItemTags.PANELS_STAIRS, WoodenObjectType.STAIRS);
        registerTag(ILikeWoodItemTags.PANELS, WoodenObjectType.PANELS);
        registerTag(ILikeWoodItemTags.WALLS, WoodenObjectType.WALL);
        registerTag(ILikeWoodItemTags.LADDERS, WoodenObjectType.LADDER);
        registerTag(ILikeWoodItemTags.TORCHES, WoodenObjectType.TORCH);
        registerTag(ILikeWoodItemTags.STICKS, WoodenObjectType.STICK);
        registerTag(ILikeWoodItemTags.CRAFTING_TABLES, WoodenObjectType.CRAFTING_TABLE);
        registerTag(ILikeWoodItemTags.SCAFFOLDINGS, WoodenObjectType.SCAFFOLDING);
        registerTag(ILikeWoodItemTags.LECTERNS, WoodenObjectType.LECTERN);
        registerTag(ILikeWoodItemTags.POSTS, WoodenObjectType.POST);
        registerTag(ILikeWoodItemTags.STRIPPED_POSTS, WoodenObjectType.STRIPPED_POST);

        registerTag(ILikeWoodItemTags.AXES, WoodenTieredObjectType.AXE);
        registerTag(ILikeWoodItemTags.HOES, WoodenTieredObjectType.HOE);
        registerTag(ILikeWoodItemTags.PICKAXES, WoodenTieredObjectType.PICKAXE);
        registerTag(ILikeWoodItemTags.SHOVELS, WoodenTieredObjectType.SHOVEL);
        registerTag(ILikeWoodItemTags.SWORDS, WoodenTieredObjectType.SWORD);
    }

    @Override
    public String getName() {
        return "I Like Wood - Item Tags";
    }
}
