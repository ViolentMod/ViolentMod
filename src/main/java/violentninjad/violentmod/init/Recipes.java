package violentninjad.violentmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import violentninjad.violentmod.util.CraftingHelper;

public class Recipes {
	

	public static void init() {
		ItemStack LapisStack = new ItemStack(Items.dye, 1 , 4);
		GameRegistry.addRecipe(new ItemStack(ModItems.blueCrystal), "l  ", "i  ", "l  ", 'l', LapisStack, 'i', Items.iron_ingot);
	}

}
