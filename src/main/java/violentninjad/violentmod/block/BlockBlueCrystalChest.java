package violentninjad.violentmod.block;
//Copyright ViolentNInjaD 2014

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import violentninjad.violentmod.ViolentMod;
import violentninjad.violentmod.reference.Guild;
import violentninjad.violentmod.reference.Names;
import violentninjad.violentmod.reference.RenderIds;
import violentninjad.violentmod.tileentity.TileEntityBlueCrystalChest;

public class BlockBlueCrystalChest extends BlockViolentMod implements ITileEntityProvider
{

    public BlockBlueCrystalChest()
    {
        super();
        this.setHardness(3.0F);
        this.setBlockName(Names.Blocks.BLUE_CRYSTAL_CHEST);
        this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileEntityBlueCrystalChest();
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return RenderIds.blueCrystalChest;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (player.isSneaking() || world.isSideSolid(x, y + 1, z, ForgeDirection.DOWN))
        {
            return true;
        }
        else
        {
            if (!world.isRemote && world.getTileEntity(x, y, z) instanceof TileEntityBlueCrystalChest)
            {
                player.openGui(ViolentMod.instance, Guild.BLUE_CRYSTAL_CHEST.ordinal(), world, x, y, z);
            }

            return true;
        }
    }

    @Override
    public boolean onBlockEventReceived(World world, int x, int y, int z, int eventId, int eventData)
    {
        super.onBlockEventReceived(world, x, y, z, eventId, eventData);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        return tileentity != null && tileentity.receiveClientEvent(eventId, eventData);
    }
}
