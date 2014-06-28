package violentninjad.violentmod.item;

import violentninjad.violentmod.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemViolentMod extends Item {
	
	public ItemViolentMod() {
		super();
		this.maxStackSize = 64;
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setNoRepair();
	}
	
	 @Override
	 public String getUnlocalizedName() {
		 return String.format("item.%s%s", Textures.PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	 }
	 
	 @Override
	 public String getUnlocalizedName(ItemStack itemStack) {
		 return String.format("item.%s%s", Textures.PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	 }
	 
	 @Override
	 @SideOnly(Side.CLIENT)
	 public void registerIcons(IIconRegister iconRegister) {
		 itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	 }

	 
	 protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }

	    
	    
	    

}
