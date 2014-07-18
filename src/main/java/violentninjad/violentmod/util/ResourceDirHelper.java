package violentninjad.violentmod.util;
//Copyright ViolentNInjaD 2014

import net.minecraft.util.ResourceLocation;
import violentninjad.violentmod.reference.ModInfo;

public class ResourceDirHelper
{
    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(ModInfo.MOD_ID.toLowerCase(), path);
    }
}
