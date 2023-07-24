package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.Crossings.ModelSmallBungalo;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileSmallBungalo;

public class RenderSmallBungalo extends TileEntitySpecialRenderer {
    private long updateTicks = 0;
    private boolean flip = true;
    private static final ModelSmallBungalo modelSwitch = new ModelSmallBungalo();
    private static final ResourceLocation textureOn = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/SmallBungalo.png");
    private static final ResourceLocation textureOn1 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/SmallBungalo.png");
    private static final ResourceLocation textureOff = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "Crossings/SmallBungalo.png");


    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.625,z+0.5);
        GL11.glRotated(180,0,1,0);
        boolean skipRender = false;
        TileSmallBungalo tile = ((TileSmallBungalo)tileEntity);


        switch (tile.getFacing()){
            case NORTH:{
                GL11.glRotated(180,0,0,1);
                break;
            }
            case SOUTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(180,0,1,0);

                break;
            }
            case EAST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(90,0,1,0);
                break;
            }
            case WEST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(270,0,1,0);
                break;
            }
            default:{
                skipRender = true;
            }
        }

        if (!skipRender) {
            updateTicks++;
            if(tile.powered) {
                if(updateTicks % 30 == 0) {
                    if (flip)
                        tmt.Tessellator.bindTexture(textureOn);
                    else
                        tmt.Tessellator.bindTexture(textureOn1);
                    flip = !flip;
                }
                else
                if (flip)
                    tmt.Tessellator.bindTexture(textureOn);
                else
                    tmt.Tessellator.bindTexture(textureOn1);
            }
            else {
                if (tile.rotation < -5 || tile.rotation > 5) {
                    if(updateTicks % 30 == 0) {
                        if (flip)
                            tmt.Tessellator.bindTexture(textureOn);
                        else
                            tmt.Tessellator.bindTexture(textureOn1);
                        flip = !flip;
                    }
                    else {
                        if (flip)
                            tmt.Tessellator.bindTexture(textureOn);
                        else
                            tmt.Tessellator.bindTexture(textureOn1);
                    }
                } else
                    tmt.Tessellator.bindTexture(textureOff);
            }
            modelSwitch.render(null, tile.rotation, 0, 0, 0, 0, 0.0625f);
        }
        GL11.glPopMatrix();
    }
}
