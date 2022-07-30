package train.client.core.handlers;

import com.jcirmodelsquad.tcjcir.features.geometry.GuiGeometryCar;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import org.lwjgl.input.Keyboard;
import train.client.gui.GuiMTCInfo;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.api.SteamTrain;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketKeyPress;
import train.common.library.EnumSounds;
import train.common.mtc.packets.PacketATO;

public class TCKeyHandler {
	public static KeyBinding horn;
	public static KeyBinding inventory;
	public static KeyBinding up;
	public static KeyBinding down;
	public static KeyBinding idle;
	public static KeyBinding furnace;
	public static KeyBinding MTCScreen;
	public static KeyBinding toggleATO;
	public static KeyBinding mtcOverride;
	public static KeyBinding overspeedOverride;
	public static KeyBinding remoteControlForward;
	public static KeyBinding remoteControlBackwards;
	public static KeyBinding remoteControlHorn;
	public static KeyBinding remoteControlBrake;
	public static KeyBinding lampControl;
	public static KeyBinding beaconToggle;
	public static KeyBinding bell;

	public long bellTimerMillis = System.currentTimeMillis();

	public TCKeyHandler() {
		horn = new KeyBinding("key.traincraft.horn", Keyboard.KEY_H, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(horn);
		inventory = new KeyBinding("key.traincraft.inventory", Keyboard.KEY_R, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(inventory);
		up = new KeyBinding("key.traincraft.up", Keyboard.KEY_NONE, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(up);
		down = new KeyBinding("key.traincraft.down", Keyboard.KEY_NONE, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(down);
		idle = new KeyBinding("key.traincraft.idle", Keyboard.KEY_C, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(idle);
		furnace = new KeyBinding("key.traincraft.furnace", Keyboard.KEY_F, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(furnace);
		bell = new KeyBinding("Locomotive Bell", Keyboard.KEY_B, "key.categories.traincraft");
		ClientRegistry.registerKeyBinding(bell);

		if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
			MTCScreen = new KeyBinding("key.traincraft.showMTCScreen", Keyboard.KEY_NONE, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(MTCScreen);
			toggleATO = new KeyBinding("key.traincraft.toggleATO", Keyboard.KEY_NONE, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(toggleATO);
			mtcOverride = new KeyBinding("key.traincraft.mtcOverride", Keyboard.KEY_NONE, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(mtcOverride);
			overspeedOverride = new KeyBinding("key.traincraft.overspeedOverride", Keyboard.KEY_NONE, "key.categories.traincraft");
			ClientRegistry.registerKeyBinding(overspeedOverride);
		}
		remoteControlForward = new KeyBinding("Remote Control Forward", Keyboard.KEY_NUMPAD8, "key.categories.traincraft");
        remoteControlBackwards = new KeyBinding("Remote Control Backwards", Keyboard.KEY_NUMPAD8, "key.categories.traincraft");
        remoteControlBrake = new KeyBinding("Remote Control Brake", Keyboard.KEY_NUMPAD0, "key.categories.traincraft");
        remoteControlHorn = new KeyBinding("Remote Control Horn", Keyboard.KEY_NUMPADENTER, "key.categories.traincraft");
		lampControl = new KeyBinding("Locomotive Lights", Keyboard.KEY_X, "key.categories.traincraft");
		beaconToggle = new KeyBinding("Toggle Beacons", Keyboard.KEY_NONE, "key.categories.traincraft");

        ClientRegistry.registerKeyBinding(remoteControlForward);
        ClientRegistry.registerKeyBinding(remoteControlBackwards);
        ClientRegistry.registerKeyBinding(remoteControlBrake);
        ClientRegistry.registerKeyBinding(remoteControlHorn);
		ClientRegistry.registerKeyBinding(lampControl);
		ClientRegistry.registerKeyBinding(beaconToggle);

	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (!Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) {
			if (up.getIsKeyPressed()) {
				sendKeyControlsPacket(0);
			}
			if (down.getIsKeyPressed()) {
				sendKeyControlsPacket(2);
			}
			if (idle.isPressed()) {
				sendKeyControlsPacket(6);
			}
			if (inventory.isPressed()) {
				sendKeyControlsPacket(7);
				if (Minecraft.getMinecraft().thePlayer.ridingEntity != null && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof ExperimentalGeometryCar) {
					Minecraft.getMinecraft().displayGuiScreen(new GuiGeometryCar(Minecraft.getMinecraft().thePlayer));
				}
			}
			if (horn.isPressed()) {
				sendKeyControlsPacket(8);
			}
			if (lampControl.isPressed()) {
				if (Minecraft.getMinecraft().thePlayer.ridingEntity != null && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;

					if (train.lampOn) {
						train.lampOn = true;
						//((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("lampOn true"));
						//System.out.println(train.lampOn);
					} else {
						train.lampOn = false;
					}
					//train.lightsOn = train.lightsOn * -1;
					//train.lampOn = !train.lampOn;
					//System.out.println(train.lampOn);
					//lamp is t/f light is number
				}
				sendKeyControlsPacket(19);
			}

			if (bell.isPressed()) {
				if (Minecraft.getMinecraft().thePlayer.ridingEntity != null && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;
						if(bellTimerMillis+ 1000 <System.currentTimeMillis()){//15000 for 15 seconds
							bellTimerMillis=System.currentTimeMillis();
							train.bellPressed=!train.bellPressed;

						}
					//train.bellPressed=!train.bellPressed;
					/*if (train.bellPressed) {
						train.bellPressed = true;//BELLPRESSED NEEDS TO BE TRUE
						System.out.println(true);// WHY AREYOUNT TRUE
					} else {
						train.bellPressed = false;
						System.out.println(false);
					}*/
				}
				sendKeyControlsPacket(10);
			}

			if (furnace.isPressed()) {
				sendKeyControlsPacket(9);
			}
			if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")) {
				if (MTCScreen.isPressed() && !FMLClientHandler.instance().isGUIOpen(GuiMTCInfo.class)) {
					if (Minecraft.getMinecraft().thePlayer.ridingEntity != null) {
						Minecraft.getMinecraft().displayGuiScreen(new GuiMTCInfo(Minecraft.getMinecraft().thePlayer.ridingEntity));
					}
				}
				if (toggleATO.isPressed() && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					sendKeyControlsPacket(16);
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;
					if (train.mtcStatus != 0 && train.mtcType == 2) {
						if (train instanceof SteamTrain && !ConfigHandler.ALLOW_ATO_ON_STEAMERS) {
							((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("Automatic Train Operation cannot be used with steam trains"));
						} else {
							if (train.atoStatus == 1) {
								train.atoStatus = 0;
							} else {
								train.atoStatus = 1;
							}
						}

					} else {
						((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("Automatic Train Operation can only be activated when you are using W-MTC"));
					}

				}


				if (mtcOverride.isPressed() && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;


					if (train.mtcOverridePressed) {
						train.mtcOverridePressed = false;
						((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("MTC has been enabled and will re-activate when the system receives new data"));
					} else {
						train.mtcOverridePressed = true;
						((EntityPlayer) train.riddenByEntity).addChatMessage(new ChatComponentText("MTC has been disabled and will not receive speed changes or transmit MTC data"));
						train.mtcStatus = 0;
						train.speedLimit = 0;
						train.nextSpeedLimit = 0;
						train.xSpeedLimitChange = 0.0;
						train.ySpeedLimitChange = 0.0;
						train.zSpeedLimitChange = 0.0;
						train.xFromStopPoint = 0.0;
						train.yFromStopPoint = 0.0;
						train.zFromStopPoint = 0.0;
						train.trainLevel = "0";

					}
					sendKeyControlsPacket(17);
				}
				if (overspeedOverride.isPressed() && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
					Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;
					sendKeyControlsPacket(18);
					if (train.mtcStatus == 1 | train.mtcStatus == 2) {
						if (train.overspeedOveridePressed) {
							train.overspeedOveridePressed = false;
						} else {
							train.overspeedOveridePressed = true;
						}
					}
				}

			}

		}

		if (FMLClientHandler.instance().getClient().gameSettings.keyBindSneak.isPressed() && Keyboard.isKeyDown(Keyboard.KEY_F3)) {
			sendKeyControlsPacket(404);
		}

		if (beaconToggle.isPressed() && Minecraft.getMinecraft().thePlayer.ridingEntity instanceof Locomotive) {
			Locomotive train = (Locomotive) Minecraft.getMinecraft().thePlayer.ridingEntity;
			sendKeyControlsPacket(20);
			train.cycleThroughBeacons();
		}
	}


	
	private static void sendKeyControlsPacket(int key)
	{
		Traincraft.keyChannel.sendToServer(new PacketKeyPress(key));
	}
}