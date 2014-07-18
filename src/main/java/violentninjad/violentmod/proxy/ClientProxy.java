package violentninjad.violentmod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import violentninjad.violentmod.client.renderer.item.ItemRendererBlueCrystalChest;
import violentninjad.violentmod.client.renderer.tileentity.TileEntityRendererBlueCrystalChest;
import violentninjad.violentmod.init.ModBlocks;
import violentninjad.violentmod.reference.RenderIds;
import violentninjad.violentmod.tileentity.TileEntityBlueCrystalChest;

public class ClientProxy extends CommonProxy {

    @Override
    public void initRenderingAndTextures() {
        RenderIds.blueCrystalChest = RenderingRegistry.getNextAvailableRenderId();

        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.blueCrystalChest), new ItemRendererBlueCrystalChest());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlueCrystalChest.class, new TileEntityRendererBlueCrystalChest());
    }

}
