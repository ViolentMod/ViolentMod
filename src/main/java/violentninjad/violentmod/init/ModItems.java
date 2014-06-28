package violentninjad.violentmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import violentninjad.violentmod.item.ItemBlueCrystal;
import violentninjad.violentmod.item.ItemViolentMod;
import violentninjad.violentmod.reference.ModInfo;

@GameRegistry.ObjectHolder(ModInfo.MOD_ID)
public class ModItems {
	
	public static final ItemViolentMod blueCrystal = new ItemBlueCrystal();
	
	public static void init() {
		GameRegistry.registerItem(blueCrystal, "blueCrystal");
	}

}
