package yamahari.ilikewood.provider.texture.block;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.registry.woodtype.IWoodType;
import yamahari.ilikewood.util.IWooden;
import yamahari.ilikewood.util.Util;

import java.util.function.Function;

public final class LogPileTextureProvider extends AbstractBlockTextureProvider {
    public LogPileTextureProvider(final DataGenerator generator, final ExistingFileHelper helper) {
        super(generator, BLOCK_FOLDER, helper, WoodenBlockType.SAWMILL); // TODO Replace with LOG_PILE once added back
    }

    @Override
    protected void createTexture(final Block block) {
        final IWoodType woodType = ((IWooden) block).getWoodType();
        final String path = Util.toPath(BLOCK_FOLDER, WoodenBlockType.LOG_PILE.getName());

        final Function<NativeImage, NativeImage> colorMapTransformer = createColorMapTransformer(woodType);

        this
            .withExistingParent(Util.toPath(path, woodType.getName()), modLoc(Util.toPath(path, "template")))
            .transform(colorMapTransformer);
    }
}
