package violentninjad.violentmod.reference;

import net.minecraft.util.ResourceLocation;
import violentninjad.violentmod.util.ResourceDirHelper;

public class Textures {
	
	public static final String PREFIX = ModInfo.MOD_ID.toLowerCase() + ":";

    public static final class Models
    {

        private static final String MODEL_RESOURCE_DIR = "textures/models";
        public static final ResourceLocation BLUE_CRYSTAL_CHEST = ResourceDirHelper.getResourceLocation(MODEL_RESOURCE_DIR + "blueCrystalChest.png");

    }

}
