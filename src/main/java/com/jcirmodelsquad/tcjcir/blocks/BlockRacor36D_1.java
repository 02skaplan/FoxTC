package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileRacor36D_1;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockRacor36D_1 extends BlockSwitchStand {
    public BlockRacor36D_1() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileRacor36D_1();
    }
}
