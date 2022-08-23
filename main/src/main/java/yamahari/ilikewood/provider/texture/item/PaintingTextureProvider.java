package yamahari.ilikewood.provider.texture.item;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import yamahari.ilikewood.registry.objecttype.WoodenItemType;
import yamahari.ilikewood.util.Constants;
import yamahari.ilikewood.util.IWooden;
import yamahari.ilikewood.util.Util;

public class PaintingTextureProvider
    extends AbstractItemTextureProvider
{
    public PaintingTextureProvider(
        final DataGenerator generator,
        final ExistingFileHelper helper
    )
    {
        super(generator, ITEM_FOLDER, helper, Constants.PAINTING_PLURAL, WoodenItemType.PAINTING);
    }

    @Override
    protected void createTexture(final Item item)
    {
        final var woodType = ((IWooden) item).getWoodType();
        final var path = Util.toPath(ITEM_FOLDER, WoodenItemType.PAINTING.getName());

        final var colorMapTransformer = createColorMapTransformer(woodType);

        this.withExistingParent(Util.toPath(path, woodType.getModId(), woodType.getName()), modLoc(Util.toPath(path, "template"))).transform(colorMapTransformer);
    }
}
