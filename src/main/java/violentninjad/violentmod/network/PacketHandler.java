package violentninjad.violentmod.network;
//Copyright ViolentNInjaD 2014

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import violentninjad.violentmod.network.message.MessageTileEntityViolentMod;
import violentninjad.violentmod.reference.ModInfo;

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.MOD_ID.toLowerCase());

    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityViolentMod.class, MessageTileEntityViolentMod.class, 0, Side.CLIENT);
    }
}





