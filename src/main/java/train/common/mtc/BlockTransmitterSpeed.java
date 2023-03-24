package train.common.mtc;


import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.peripheral.IPeripheralProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class BlockTransmitterSpeed extends BlockContainer implements IPeripheralProvider {


    public static BlockTransmitterSpeed instance;
    public BlockTransmitterSpeed(Material p_i45386_1_) {
        super(p_i45386_1_);
        instance = this;
    }
    @Override
    public IPeripheral getPeripheral(World world, int x, int y, int z, int side) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        return (IPeripheral)tileEntity;

    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileTransmitterSpeed();
    }
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float sideX, float sideY, float sideZ) {
        // System.out.println("ting");
        if (world.isRemote) {
            Minecraft.getMinecraft().displayGuiScreen(new train.client.gui.GuiSpeedTransmitter(world.getTileEntity(x, y, z)));
        }
        return true;
    }



}
