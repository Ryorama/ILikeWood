package yamahari.ilikewood.provider.itemmodel.blockitem;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.util.IWooden;
import yamahari.ilikewood.util.Util;

public final class StoolBlockItemModelProvider
    extends AbstractBlockItemModelProvider
{
    public StoolBlockItemModelProvider(
        final DataGenerator generator,
        final ExistingFileHelper helper
    )
    {
        super(generator, helper, WoodenBlockType.STOOL);
    }

    @Override
    protected void registerModel(final Block block)
    {
        this.blockItem(block, Util.toPath(WoodenBlockType.STOOL.getName(), ((IWooden) block).getWoodType().getModId()));
    }
}
