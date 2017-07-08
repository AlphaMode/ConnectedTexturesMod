package team.chisel.ctm.api.model;

import java.util.Collection;

import javax.annotation.Nullable;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.model.IModel;
import team.chisel.ctm.api.texture.ICTMTexture;
import team.chisel.ctm.api.texture.IChiselFace;

public interface IModelCTM extends IModel {

    void load();

    Collection<ICTMTexture<?>> getChiselTextures();
    
    ICTMTexture<?> getTexture(String iconName);

    @Deprecated
    IChiselFace getFace(EnumFacing facing);

    @Deprecated
    IChiselFace getDefaultFace();

    @Deprecated
    boolean ignoreStates();

    boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer);

    @Nullable
    TextureAtlasSprite getOverrideSprite(int tintIndex);

    @Nullable
    ICTMTexture<?> getOverrideTexture(int tintIndex, String sprite);
}
