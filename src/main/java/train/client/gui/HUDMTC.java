package train.client.gui;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import ebf.XmlBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;
import train.common.api.Locomotive;
import train.common.api.SteamTrain;
import train.common.library.Info;

import static train.common.adminbook.GUIAdminBook.drawTexturedRect;

public class HUDMTC extends GuiScreen {

	private Minecraft game;
	private int windowWidth, windowHeight;
	public boolean mtcIconOnOff = true;

	public static int guiTop;
	public static int guiLeft;

//test15
	@SubscribeEvent
	public void onGameRender(RenderGameOverlayEvent.Text event){
		if (game != null && game.thePlayer != null && game.thePlayer.ridingEntity != null && game.thePlayer.ridingEntity instanceof Locomotive /*&& Minecraft.isGuiEnabled() && game.currentScreen == null*/) {
			renderSkillHUD(event, (Locomotive) game.thePlayer.ridingEntity);
		} else {
			this.game = this.mc = Minecraft.getMinecraft();
			this.fontRendererObj = this.game.fontRenderer;
		}
	}

	public void renderSkillHUD(RenderGameOverlayEvent event, Locomotive loco) {
		if (loco.mtcStatus == 0 ) return;

		int width = this.game.fontRenderer.getStringWidth(EnumChatFormatting.GREEN + "Speed Limit" + EnumChatFormatting.GRAY + " / " + EnumChatFormatting.YELLOW + "Next Speed Limit");

		guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
		guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();
		//loco.distanceFromSpeedChange = loco.getDistance(loco.speedChange3.xCoord, loco.speedChange3.yCoord,loco.speedChange3.zCoord);
		loco.distanceFromStopPoint = loco.getDistance(loco.stopPoint3.xCoord, loco.stopPoint3.yCoord, loco.stopPoint3.zCoord);
		loco.distanceFromSpeedChange = loco.getDistance(loco.speedChange3.xCoord, loco.speedChange3.yCoord,loco.speedChange3.zCoord);
		loco.distanceFromStationStop = loco.getDistance(loco.stationStop3.xCoord, loco.stationStop3.yCoord,loco.stationStop3.zCoord);
		
		this.width = 300;
		this.height = 256;
		windowHeight = event.resolution.getScaledHeight();

		double speedScaled = Math.abs((loco.getSpeed() * (int)(guiLeft*0.275f)) / loco.getMaxSpeed());
		double nextSpeedScaled = Math.abs((loco.distanceFromSpeedChange * (int)(guiLeft*0.275f)) / loco.getMaxSpeed());
		double stationStopScaled = Math.abs((loco.distanceFromStationStop * (int)(guiLeft*0.275f)) / loco.getMaxSpeed());
		/*if (loco.getMaxSpeed() > nextSpeedScaled ) {
			nextSpeedScaled = (int) (guiLeft*0.275f);
		}*/


		Gui.drawRect((int)(guiLeft*0.009f),(int)(guiTop*0.01f),(int)(guiLeft*0.3f),(int)(guiTop*0.17f) //Background

				/*event.resolution.getScaledWidth() / 2 - 50) + 50,(event.resolution.getScaledHeight() / 2 - 50) + 50, (event.resolution.getScaledWidth() / 2 - 50) + 80, (event.resolution.getScaledHeight() / 2 - 50) + 40*/, 0xA4000000/*0xA1999999, 0xa10066cc*/);

		fontRendererObj.drawStringWithShadow(EnumChatFormatting.GREEN + "Speed Limit" + EnumChatFormatting.GRAY + " / " + EnumChatFormatting.YELLOW + "Next Speed Limit",(int) (guiLeft*0.020f),(int)(guiTop*0.018f), 0xFFFFFF);

		//Draw Speedometer
		Gui.drawRect((int)(guiLeft*0.020f),(int)(guiTop*0.06f),(int)(guiLeft*0.288f),(int)(guiTop*0.08f), 0xFF555555); //Speedometer background
		Gui.drawRect((int)(guiLeft*0.020f),(int)(guiTop*0.06f), (int) ((int)(guiLeft*0.020f) + speedScaled),(int)(guiTop*0.08f), loco.getSpeed() > loco.speedLimit ?  0xFFFF5733 : 0xFFFFFFFF); //Speed

		//Draw speed text
		int textPos = (int)(guiLeft*0.020f);
		for (int i = 0; i < 6; i++) {
			double speed = 5*(Math.ceil(Math.abs(loco.getMaxSpeed() * (i * 0.2)/5)));

			fontRendererObj.drawStringWithShadow(Long.toString(Math.round(speed)),textPos,(int)(guiTop*0.104f), 0xFFFFFF);
			textPos = (int) (textPos + 48);
		}
		fontRendererObj.drawStringWithShadow("kmh/m",textPos - 52,(int)(guiTop*0.13f), 0xFFFFFF);

		float speedPosMain = 0;
		int numDigits = String.valueOf(Math.round(loco.speedLimit)).length();

		if (numDigits == 1) {
			speedPosMain = 0 ;

		} else if (numDigits == 2) {
			speedPosMain = 6;
		} else {
			speedPosMain = 25;
		}

		float speedPosNext = 0;
		int numDigits2 = String.valueOf(Math.round(loco.nextSpeedLimit)).length();

		if (numDigits2 == 1) {
			speedPosNext = 0 ;

		} else if (numDigits2 == 2) {
			speedPosNext = 6;
		} else {
			speedPosNext = 28;
		}

		//Speed Change Distance Indicator

		if (loco.nextSpeedLimit != 0) Gui.drawRect((int)(guiLeft*0.020f),(int)(guiTop*0.085f), (int) ((int)(guiLeft*0.020f) + nextSpeedScaled)  ,(int)(guiTop*0.09f), 0xFFFFFF55);


		if (loco.stationStop3.xCoord != 0) Gui.drawRect((int)(guiLeft*0.020f),(int)(guiTop*0.095f), (int) ((int)(guiLeft*0.020f) + stationStopScaled)  ,(int)(guiTop*0.1f), (127 << 24) | 0xFF0000);


		fontRendererObj.drawStringWithShadow(EnumChatFormatting.GREEN + Integer.toString(loco.speedLimit), (int)((guiLeft*0.020f) + Math.abs((loco.speedLimit * (int)(guiLeft*0.275f)) / loco.getMaxSpeed()) - speedPosMain),(int)(guiTop*0.04f), 0xFFFFFF);
		fontRendererObj.drawStringWithShadow(EnumChatFormatting.YELLOW + Integer.toString(loco.nextSpeedLimit),(int)((guiLeft*0.020f) + Math.abs((loco.nextSpeedLimit * (int)(guiLeft*0.275f)) / loco.getMaxSpeed()) - speedPosNext),(int)(guiTop*0.04f), 0xFFFFFF);

		//fontRendererObj.drawStringWithShadow(EnumChatFormatting.YELLOW + Integer.toString(loco.nextSpeedLimit),(int)((guiLeft*0.020f) + Math.abs((loco.nextSpeedLimit * (int)(guiLeft*0.275f)) / loco.getMaxSpeed())),(int)(guiTop*0.1f), 0xFFFFFF);

		//Stop Point Distance Indicator
		//Gui.drawRect((int)(guiLeft*0.020f),(int)(guiTop*0.095f), (int) ((int)(guiLeft*0.020f) + stopScaled)  ,(int)(guiTop*0.099f), 0xFFFF5555);

		//Draw icons
		if (loco.mtcOverridePressed) {
			drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcdisable.png"), 12, (int)(guiTop*0.1f), 0, 0, 64, 64, 64, 64, 0.25);
		} else if (loco.mtcStatus == 1 || loco.mtcStatus == 2) {
			if (mtcIconOnOff) {

				if (loco.mtcType == 1 || loco.mtcType == 0) {
					drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcicon.png"), (int)(guiLeft*0.020f), (int)(guiTop*0.13f), 0, 0, 64, 64, 64, 64, 0.25);
				} else if (loco.mtcType == 2){
					drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcicon2.png"),(int)(guiLeft*0.020f), (int)(guiTop*0.13f), 0, 0, 64, 64, 64, 64, 0.25);
				} else {
					drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcicon3.png"),(int)(guiLeft*0.020f), (int)(guiTop*0.13f), 0, 0, 64, 64, 64, 64, 0.25);
				}

			}
		}

		if (loco.atoStatus == 1 && loco.mtcType == 2) drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "ato_lvl2.png"), (int)(guiLeft*0.070f), (int)(guiTop*0.13f), 0, 0, 64, 64, 64, 64, 0.25);
		if (loco.atoStatus == 1 && loco.mtcType == 3) drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "ato_lvl3.png"), (int)(guiLeft*0.070f), (int)(guiTop*0.13f), 0, 0, 64, 64, 64, 64, 0.25);


		/*GL11.glPushMatrix(); //Start new matrix
        GL11.glScalef(1.2f,1.2f,1.2f);
        GL11.glTranslated((width * -5), (width * -5), (width * 3))*/;//scale it to 0.5 size on each side. Must be float e.g.: 2.0F*/


		//fontRendererObj.drawStringWithShadow(Math.round(loco.getSpeed()) + "km/h",speedPositions,(int)(guiTop*0.845f), 0xFFFFFF); //fr - fontRenderer
		/*GL11.glPopMatrix();*/


		/*GL11.glEnable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		Tessellator tes = Tessellator.instance;
		tes.startDrawing(GL11.GL_TRIANGLES);
		tes.addVertex(20, 20, 0);
		tes.addVertex(20, 30, 0);
		tes.addVertex(30, 20, 0);
		tes.draw();
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_BLEND);*/

		//Draw autotrain stuff.

		if (loco.mtcType == 3) {
			Gui.drawRect((int)(guiLeft*0.009f),(int)(guiTop*0.18f),(int)(guiLeft*0.3f),(int)(guiTop*0.5f), 0x802766D6);
			if (loco.getDataWatcher().getWatchableObjectString(29).isEmpty()) return;
			StringBuilder output = new StringBuilder();
			StringBuilder actionDisplay = new StringBuilder();
			JsonObject status = new JsonParser().parse(loco.getDataWatcher().getWatchableObjectString(29)).getAsJsonObject();
			output.append("AutoTrain-2\n");
			output.append("Status: ").append(status.get("status").getAsString()).append("\n");
			output.append("Position: ").append(status.get("progress").getAsString()).append("\n");
;

			JsonArray driveScript = status.get("driveScript").getAsJsonArray();

			for (int i = 0; i < driveScript.size(); i++) {
				JsonObject action = driveScript.get(i).getAsJsonObject();
				output.append(status.get("progress").getAsInt() == i ?  EnumChatFormatting.GREEN + ">> " : "")
				.append(action.get("action").getAsString())
						.append(" (")
						.append(action.get("param1").getAsString())
						.append(", ")
						.append(action.get("param2").getAsString().isEmpty() ? "null" : action.get("param2").getAsString())
						.append(") ")
						.append(action.get("position").getAsString())
						.append("\n");

			}

			String[] text = output.toString().split("\n");

			GL11.glPushMatrix();
			for(int i = 0; i < text.length; i++) {
				String str = text[i];

				fontRendererObj.drawStringWithShadow(str,  (int)(guiLeft*0.020f), (int) (guiTop*0.19),/* status.get("progress").getAsInt() == i ? 0x55FF55 : */0xFFFFFF );
				// fontRendererObj.drawStringWithShadow("_", x + fontRendererObj.getStringWidth(str) + -68, y - 10, 0xFFFFFF);
				GL11.glTranslatef(0,10,0);
			}
			GL11.glPopMatrix();
			//fontRendererObj.drawStringWithShadow(actionDisplay.toString(),(int)(guiLeft*0.012f), (int) (guiTop*0.28), 0xFFFFFF);
		}
}


	public void renderSkillHUDOld(RenderGameOverlayEvent event, Locomotive rcCar) {
		windowWidth = event.resolution.getScaledWidth();
		windowHeight = event.resolution.getScaledHeight() - 100;

		if (rcCar.mtcStatus == 1 || rcCar.mtcStatus == 2) {
			/**
			 * Steam Train have water
			 */
			String mtcStatus = "";
			if (rcCar.mtcStatus == 0) {
				mtcStatus = "Inactive";
			}

			if (rcCar.mtcStatus == 1) {
				mtcStatus = "Active";
			}
			if (rcCar.mtcStatus == 2) {
				mtcStatus = "Ending Soon";
			}
			if (rcCar.mtcStatus == 3) {

				mtcStatus = "Ended";
			}
			int width = this.game.fontRenderer.getStringWidth("Speed Limit: " + rcCar.speedLimit + " km/h");

			int width2 = this.game.fontRenderer.getStringWidth("");
			int height = this.game.fontRenderer.FONT_HEIGHT;
			int padding = 2;
			int margin = 4;
			int xPos = 0 + margin;
			int yPos = 0 + margin;
					Gui.drawRect(xPos, yPos, xPos + width + padding * 2 + 70, yPos + height + padding + padding + 35, 8);
			if (rcCar.atoStatus == 1) {
				this.drawString(this.game.fontRenderer, "Speed Limit: " + rcCar.speedLimit + " km/h" + ", ATO on", xPos + 4, yPos, 14737632);
			} else {
				this.drawString(this.game.fontRenderer, "Speed Limit: " + rcCar.speedLimit + " km/h", xPos + 4, yPos, 14737632);
			}
			this.drawString(this.game.fontRenderer, "Next Speed Limit: " + rcCar.nextSpeedLimit + " km/h", xPos + 4, yPos + 10, 14737632);
			rcCar.distanceFromStopPoint = rcCar.getDistance(rcCar.stopPoint3.xCoord, rcCar.stopPoint3.yCoord, rcCar.stopPoint3.zCoord);
			rcCar.distanceFromSpeedChange = rcCar.getDistance(rcCar.speedChange3.xCoord, rcCar.speedChange3.yCoord,rcCar.speedChange3.zCoord);
			rcCar.distanceFromStationStop = rcCar.getDistance(rcCar.stationStop3.xCoord, rcCar.stationStop3.yCoord,rcCar.stationStop3.zCoord);
			if (rcCar.stopPoint3.xCoord != 0) {
				this.drawString(this.game.fontRenderer, "Stop in " + Math.round(rcCar.distanceFromStopPoint)  + " blocks.", xPos + 4, yPos + 19, 14737632);
			}
			if (rcCar.stationStop3.xCoord != 0) {
				this.drawString(this.game.fontRenderer, "Station stop in " +Math.round(rcCar.distanceFromStationStop) + " blocks.", xPos + 4, yPos + 19, 14737632);
			}
			if (rcCar.speedChange3.xCoord != 0) {
				this.drawString(this.game.fontRenderer, "Next speed limit in " + Math.round(rcCar.distanceFromSpeedChange)  + " blocks.", xPos + 4, yPos + 28, 14737632);
			}

			if (rcCar.speedLimit < rcCar.getSpeed() && !rcCar.overspeedOveridePressed) {
				drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcspeeding.png"), 30, 45, 0, 0, 64, 64, 64, 64, 0.25);
			} else if (rcCar.overspeedOveridePressed) {
				drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcspeedingoverride.png"), 30, 45, 0, 0, 64, 64, 64, 64, 0.25);
			}

			//hey

		}

		if (rcCar.ticksExisted % 21 == 0 && rcCar.mtcStatus == 2) {
			if (mtcIconOnOff) {
				mtcIconOnOff = false;
			} else {
				mtcIconOnOff = true;
			}
		} else if (rcCar.mtcStatus == 1) {
			mtcIconOnOff = true;
		}

		if (rcCar.mtcOverridePressed) {
			drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcdisable.png"), 12, 45, 0, 0, 128, 128, 64, 64, 0.25);
		} else if (rcCar.mtcStatus == 1 || rcCar.mtcStatus == 2) {
			if (mtcIconOnOff) {
				if (rcCar.mtcType == 1 || rcCar.mtcType == 0) {
					drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcicon.png"), 12, 45, 0, 0, 128, 128, 64, 64, 0.25);
				} else {
					drawTexturedRect(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "mtcicon2.png"), 12, 45, 0, 0, 64, 64, 64, 64, 0.25);
				}

			}
		}

	}

	public static void drawTexturedRect(ResourceLocation texture, double x, double y, int u, int v, int width, int height, int imageWidth, int imageHeight, double scale) {
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		double minU = (double)u / (double)imageWidth;
		double maxU = (double)(u + width) / (double)imageWidth;
		double minV = (double)v / (double)imageHeight;
		double maxV = (double)(v + height) / (double)imageHeight;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(x + scale*(double)width, y + scale*(double)height, 0, maxU, maxV);
		tessellator.addVertexWithUV(x + scale*(double)width, y, 0, maxU, minV);
		tessellator.addVertexWithUV(x, y, 0, minU, minV);
		tessellator.addVertexWithUV(x, y + scale*(double)height, 0, minU, maxV);
		tessellator.draw();
	}
}
