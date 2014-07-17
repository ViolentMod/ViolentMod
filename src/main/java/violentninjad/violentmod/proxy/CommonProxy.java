package violentninjad.violentmod.proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import violentninjad.violentmod.reference.Names;
import violentninjad.violentmod.tileentity.TileEntityBlueCrystalChest;

public abstract class CommonProxy implements IProxy {

    public void registerTileEntities()
    {
        // GameRegistry.registerTileEntityWithAlternatives(TileEntityBlueCrystalChest.class, Names.Blocks.BLUE_CRYSTAL_CHEST, "tile." + Names.Blocks.BLUE_CRYSTAL_CHEST);
    }

}
