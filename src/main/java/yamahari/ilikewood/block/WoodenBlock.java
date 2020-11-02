package yamahari.ilikewood.block;

import net.minecraft.block.Block;
import yamahari.ilikewood.IWoodType;
import yamahari.ilikewood.util.IWooden;

public class WoodenBlock extends Block implements IWooden {
    private final IWoodType type;

    public WoodenBlock(final IWoodType type, final Block.Properties properties) {
        super(properties);
        this.type = type;
    }

    @Override
    public IWoodType getWoodType() {
        return this.type;
    }
}
