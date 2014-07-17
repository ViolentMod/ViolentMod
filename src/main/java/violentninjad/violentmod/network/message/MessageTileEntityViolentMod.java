package violentninjad.violentmod.network.message;
//Copyright ViolentNInjaD 2014

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import violentninjad.violentmod.tileentity.TileEntityViolentMod;

public class MessageTileEntityViolentMod implements IMessage, IMessageHandler<MessageTileEntityViolentMod, IMessage>
{
    public int x, y, z;
    public byte orientation, state;
    public String customName, owner;

    public MessageTileEntityViolentMod()
    {
    }

    public MessageTileEntityViolentMod(TileEntityViolentMod tileEntityViolentMod)
    {
        this.x = tileEntityViolentMod.xCoord;
        this.y = tileEntityViolentMod.yCoord;
        this.z = tileEntityViolentMod.zCoord;
        this.orientation = (byte) tileEntityViolentMod.getOrientation().ordinal();
        this.state = (byte) tileEntityViolentMod.getState();
        this.customName = tileEntityViolentMod.getCustomName();
        this.owner = tileEntityViolentMod.getOwner();
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.orientation = buf.readByte();
        this.state = buf.readByte();
        int customNameLength = buf.readInt();
        this.customName = new String(buf.readBytes(customNameLength).array());
        int ownerLength = buf.readInt();
        this.owner = new String(buf.readBytes(ownerLength).array());
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeByte(orientation);
        buf.writeByte(state);
        buf.writeInt(customName.length());
        buf.writeBytes(customName.getBytes());
        buf.writeInt(owner.length());
        buf.writeBytes(owner.getBytes());
    }

    @Override
    public IMessage onMessage(MessageTileEntityViolentMod message, MessageContext ctx)
    {
        TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.x, message.y, message.z);

        if (tileEntity instanceof TileEntityViolentMod)
        {
            ((TileEntityViolentMod) tileEntity).setOrientation(message.orientation);
            ((TileEntityViolentMod) tileEntity).setState(message.state);
            ((TileEntityViolentMod) tileEntity).setCustomName(message.customName);
            ((TileEntityViolentMod) tileEntity).setOwner(message.owner);
        }

        return null;
    }

    @Override
    public String toString()
    {
        return String.format("MessageTileEntityEE - x:%s, y:%s, z:%s, orientation:%s, state:%s, customName:%s, owner:%s", x, y, z, orientation, state, customName, owner);
    }
}

