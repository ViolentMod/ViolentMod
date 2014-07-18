package violentninjad.violentmod.init;
//Copyright ViolentNInjaD 2014

import cpw.mods.fml.common.registry.GameRegistry;
import violentninjad.violentmod.block.BlockBlueCrystalChest;
import violentninjad.violentmod.block.BlockViolentMod;
import violentninjad.violentmod.item.ItemBlockBlueCrystalChest;
import violentninjad.violentmod.reference.ModInfo;
import violentninjad.violentmod.reference.Names;

@GameRegistry.ObjectHolder(ModInfo.MOD_ID)
public class ModBlocks {

    public static final BlockViolentMod blueCrystalChest = new BlockBlueCrystalChest();

    public static void init()
    {
        GameRegistry.registerBlock(blueCrystalChest, ItemBlockBlueCrystalChest.class, Names.Blocks.BLUE_CRYSTAL_CHEST);
    }
}
