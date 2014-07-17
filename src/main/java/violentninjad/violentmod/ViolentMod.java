package violentninjad.violentmod;
//Copyright ViolentNInjaD 2014

import net.minecraft.client.stream.TwitchStream;
import net.minecraftforge.common.config.Configuration;
import violentninjad.violentmod.block.BlockViolentMod;
import violentninjad.violentmod.init.ModBlocks;
import violentninjad.violentmod.init.ModItems;
import violentninjad.violentmod.init.Recipes;
import violentninjad.violentmod.network.PacketHandler;
import violentninjad.violentmod.proxy.IProxy;
import violentninjad.violentmod.reference.ModInfo;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid=ModInfo.MOD_ID, name=ModInfo.MOD_NAME, version=ModInfo.MOD_VERSION)
public class ViolentMod {
	
	    @Mod.Instance("ViolentMod")
	    public static ViolentMod instance;
	    
	    @SidedProxy(clientSide = "violentninjad.violentmod.proxy.ClientProxy", serverSide = "violentninjad.violentmod.proxy.ServerProxy")
        public static IProxy proxy;
	    
	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	    	
	    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
			
			config.load();
			
			config.save();

            PacketHandler.init();

            ModBlocks.init();
	    	
	    	ModItems.init();
	    }


	    @Mod.EventHandler
	    public void init(FMLInitializationEvent event) {

            proxy.registerTileEntities();
	    	
	    	Recipes.init();
	    	
	    }
	

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent event) {
	    	
	    }
	    

}
