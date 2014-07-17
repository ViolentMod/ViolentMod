package violentninjad.violentmod.item;
//Copyright ViolentNInjaD 2014

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemBlockBlueCrystalChest extends ItemBlock
{
    public ItemBlockBlueCrystalChest(Block block)
    {
        super(block);
        this.setHasSubtypes(false);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean flag)
    {
       list.add(StatCollector.translateToLocal("tooltip.ViolentMod:blueCrystalChestPrefix.standard"));

    }
}
