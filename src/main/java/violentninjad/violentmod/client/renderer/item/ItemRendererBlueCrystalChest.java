package violentninjad.violentmod.client.renderer.item;
//Copyright ViolentNInjaD 2014

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelChest;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import cpw.mods.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import violentninjad.violentmod.reference.Textures;

@SideOnly(Side.CLIENT)
public class ItemRendererBlueCrystalChest implements IItemRenderer
{
    private final ModelChest modelChest;

    public ItemRendererBlueCrystalChest()
    {
        modelChest = new ModelChest();
    }

    @Override
    public boolean handleRenderType(ItemStack itemStack, ItemRenderType itemRenderType)
    {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType itemRenderType, ItemStack itemStack, ItemRendererHelper itemRendererHelper)
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType itemRenderType, ItemStack itemStack, Object... data)
    {
        switch (itemRenderType)
        {
            case ENTITY:
            {
                renderBlueCrystalChest(0.0F, 0.075F, 0.0F);
                break;
            }
            case EQUIPPED:
            {
                renderBlueCrystalChest(0.0F, 0.075F, 0.0F);
                break;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                renderBlueCrystalChest(0.0F, 0.075F, 0.0F);
                break;
            }
            case INVENTORY:
            {
                renderBlueCrystalChest(0.0F, 0.075F, 0.0F);
                break;
            }
            default:
                break;
        }
    }

    private void renderBlueCrystalChest(float x, float y, float z)
    {

        FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.Models.BLUE_CRYSTAL_CHEST);

        GL11.glPushMatrix(); //start
        GL11.glTranslatef(x, y, z); //size
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(-90, 0, 1, 0);
        modelChest.renderAll();
        GL11.glPopMatrix(); //end
    }
}
