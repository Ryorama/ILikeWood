package yamahari.ilikewood.provider.texture.block;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.registry.woodtype.IWoodType;
import yamahari.ilikewood.util.Constants;
import yamahari.ilikewood.util.IWooden;
import yamahari.ilikewood.util.Util;

import java.util.function.Function;

public final class BedTextureProvider extends AbstractBlockTextureProvider {
    public BedTextureProvider(final DataGenerator generator, final ExistingFileHelper helper) {
        super(generator, BLOCK_FOLDER, helper, Constants.BEDS, WoodenBlockType.WHITE_BED);
    }

    @Override
    protected void createTexture(final Block block) {
        final IWoodType woodType = ((IWooden) block).getWoodType();
        final String path = Util.toPath(BLOCK_FOLDER, "bed", "frame");

        final Function<NativeImage, NativeImage> colorMapTransformer = createColorMapTransformer(woodType);

        this
            .withExistingParent(Util.toPath(path, woodType.getName()), modLoc(Util.toPath(path, "template")))
            .transform(colorMapTransformer);
    }
}
