package violentninjad.violentmod.tileentity;
//Copyright ViolentNInjaD 2014

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import violentninjad.violentmod.network.PacketHandler;
import violentninjad.violentmod.network.message.MessageTileEntityViolentMod;
import violentninjad.violentmod.reference.NBT;
import net.minecraft.network.Packet;

public class TileEntityViolentMod extends TileEntity {

    protected ForgeDirection orientation;
    protected byte state;
    protected String customName;
    protected String owner;

    public TileEntityViolentMod() {
        orientation = ForgeDirection.SOUTH;
        state = 0;
        customName = "";
        owner = "";
    }

    public ForgeDirection getOrientation() {
        return orientation;
    }

    public void setOrientation(ForgeDirection orientation)
    {
        this.orientation = orientation;
    }

    public void setOrientation(int orientation)
    {
        this.orientation = ForgeDirection.getOrientation(orientation);
    }

    public short getState()
    {
        return state;
    }

    public void setState(byte state)
    {
        this.state = state;
    }

    public String getCustomName()
    {
        return customName;
    }

    public void setCustomName(String customName)
    {
        this.customName = customName;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);

        if (nbtTagCompound.hasKey(NBT.Direction))
        {
            this.orientation = ForgeDirection.getOrientation(nbtTagCompound.getByte(NBT.Direction));
        }

        if (nbtTagCompound.hasKey(NBT.State))
        {
            this.state = nbtTagCompound.getByte(NBT.State);
        }

        if (nbtTagCompound.hasKey(NBT.CustomName))
        {
            this.customName = nbtTagCompound.getString(NBT.CustomName);
        }

        if (nbtTagCompound.hasKey(NBT.Owner))
        {
            this.owner = nbtTagCompound.getString(NBT.Owner);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound)
    {
        super.writeToNBT(nbtTagCompound);

        nbtTagCompound.setByte(NBT.Direction, (byte) orientation.ordinal());
        nbtTagCompound.setByte(NBT.State, state);

        if (this.hasCustomName())
        {
            nbtTagCompound.setString(NBT.CustomName, customName);
        }

        if (this.hasOwner())
        {
            nbtTagCompound.setString(NBT.Owner, owner);
        }
    }

    public boolean hasCustomName()
    {
        return customName != null && customName.length() > 0;
    }

    public boolean hasOwner()
    {
        return owner != null && owner.length() > 0;
    }

    @Override
    public Packet getDescriptionPacket()
    {
        return PacketHandler.INSTANCE.getPacketFrom(new MessageTileEntityViolentMod(this));
    }

}
