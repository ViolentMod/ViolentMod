package violentninjad.violentmod;
//Copyright ViolentNInjaD 2014

import violentninjad.violentmod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="ViolentMod", name="Violent Mod", version="AlphaBuild1")
public class ViolentMod {
	
	    @Mod.Instance("ViolentMod")
	    public static ViolentMod instance;
	    
	    @SidedProxy(clientSide = "violentninjad.violentmod.proxy.ClientProxy", serverSide = "violentninjad.violentmod.proxy.ServerProxy")
        public static IProxy proxy;
	    
	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	    	
	    }


	    @Mod.EventHandler
	    public void init(FMLInitializationEvent event) {
	    	
	    }
	

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent event) {
	    	
	    }
	    

}
