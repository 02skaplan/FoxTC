package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.*;
import train.common.entity.rollingStock.*;

public enum EnumSounds {

	//TC Steam Stuff
	locoCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoHeavySteam(EntityLocoSteamHeavy.class, "hancock_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteam(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoA4(EntityLocoSteamMallardA4.class, "a4_whistle", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamBig(EntityLocoSteamHeavy.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamPannier(EntityLocoSteamPannier.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamC41(EntityLocoSteamC41.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamC41080(EntityLocoSteamC41_080.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamfowler(EntityLocoSteamFowler.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamberk765(EntityLocoSteamBerk765.class, "765_whistle", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamberk1225(EntityLocoSteamBerk1225.class, "1225_whistle", 0.6F, "pe_run", 0.4F, 20, "pe_idle", 0.4F, 20, true, " ", 0),
	locoSteamAlcoSC4(EntityLocoSteamAlcoSC4.class, "ebt_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamS100UK(EntityLocoSteamUSATCUK.class, "german_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamS100US(EntityLocoSteamUSATCUS.class, "american_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamHallClass(EntityLocoSteamHallClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamKingClass(EntityLocoSteamKingClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamSouthern1102(EntityLocoSteamSouthern1102.class, "southern_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamC41T(EntityLocoSteamC41T.class, "drgw_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamForney(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamSmall(EntityLocoSteamSmall.class, "steam_horn", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamShay(EntityLocoSteamShay.class, "lukenhimer_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamClass62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamD51S(EntityLocoSteamD51.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamD51L(EntityLocoSteamD51Long.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamSnowPlow(EntityLocoSteamSnowPlow.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true, " ", 0),
	locoSteamGS4(EntityLocoSteamGS4.class, "daylight_whistle", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamMILWClassA(EntityLocoSteamMILWClassA.class, "leslie_a125", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamAlice(EntityLocoSteamAlice0_4_0.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamGLYN(EntityLocoSteamGLYN042T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamvb(EntityLocoSteam040VB.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true, " ", 0),
	locoSteamvbShay(EntityLocoSteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteam262T(EntityLocoSteam262T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamClimax(EntityLocoSteamClimax.class, "crosby_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamCoranationClass(EntityLocoSteamCoranationClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamLSSP7(EntityLocoSteamLSSP7.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	//TC Electric Stuff
	locoElectricVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricHighSpeed(EntityLocoElectricHighSpeedZeroED.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricSubwayNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricTramWood(EntityLocoElectricTramWood.class, "tram_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricAEM7(ElectricAEM7.class, "aem7_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricIC4_DSB_MG(EntityLocoDieselIC4_DSB_MG.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),
	locoElectricSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricICE1(EntityLocoElectricICE1.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),
	locoElectricE10(EntityLocoElectricE10_DB.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	locoElectricBR185(EntityLocoElectricBR185.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricClass85(EntityLocoElectricClass85.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricE103(EntityLocoElectricE103.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	LocoElectricBP4(EntityLocoElectricBP4.class, "nathan_k5la_3", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	//TC Diesel Stuff
	locoDieselFOLM1(EntityLocoDieselFOLM1.class, "nathan_p01235", 0.8F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false, " ", 0),
	locoDieselFOLM1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFOLM1B.class, " ", 0.8F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false, " ", 0),
	locoDieselCD742(EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40, false, " ", 0),
	locoDieselChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "EMD_16_645E3_Notch8", 0.65F, 40, "EMD_16_645E3_Idle", 0.65F, 40, false, " ", 0),
	locoDieselWLs40(EntityLocoDieselWLs40.class, "vl10_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselBamboo(EntityLocoDieselBamboo.class, "gp_horn", 0F, "chme3_idle", 0.2F, 40, "chme3_idle", 0.1F, 40, false, " ", 0),
	locoDieselSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "EMD_16_710G3B_Notch8", 0.65F, 40, "EMD_16_710G3B_Idle", 0.65F, 40, false, " ", 0),
	locoDieselDD35A(EntityLocoDieselDD35A.class, "sd70_horn", 0.8F, "EMD_16_567D3A_Notch8", 0.65F, 40, "EMD_16_567D3A_Idle", 0.65F, 40, false, " ", 0),
	locoDieselShunter(EntityLocoDieselShunter.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDiesel44tonSwitcher(EntityLocoDiesel44TonSwitcher.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselF7(EntityLocoDieselEMDF7.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselF3(EntityLocoDieselEMDF3.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselDeltic(EntityLocoDieselDeltic.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselClass66(EntityLocoDieselClass66.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselCD151(EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),
	//JCTC Content Starts Below
	//
	//JCTC Alco Diesels
	DieselC424(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC424.class, "leslie_s3", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false, " ", 0),
	DieselC425(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC425.class, "leslie_s3", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false, " ", 0),
	DieselC415H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415H.class, "nathan_p14r2", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true, " ", 0),
	DieselC415L(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415L.class, "leslie_s3lr", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true, " ", 0),
	DieselC415S(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415S.class, "leslie_s3lr", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true, " ", 0),
	DieselDH643(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDH643.class, "nathan_p3_3", 2.5F, "ALCO_12_251C_Notch8", 0.65F, 40, "ALCO_12_251C_Idle", 0.65F, 50, true, " ", 0),
	DieselHH600(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHH660.class,"leslie_a200", 2.5F, "ALCO_6_531_Notch8", 0.7F, 40, "ALCO_6_531_Notch8", 0.7F, 60, false, " ", 0),
	DieselPA1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselPA1.class,"leslie_a200_2", 2.5F, "ALCO_16_244_Notch8", 1F, 8, "ALCO_16_244_Idle", 1F, 50, false, " ", 0),
	DieselPB1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselPB1.class," ", 2.5F, "ALCO_16_244_Notch8", 1F, 8, "ALCO_16_244_Idle", 1F, 50, false, " ", 0),
	DieselRSD15(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRSD15.class,"leslie_rs5t", 2.5F, "ALCO_16_244_Notch8", 1F, 8, "ALCO_16_244_Idle", 1F, 50, false, " ", 0),
	DieselS2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselS2.class, "leslie_a200", 1F, "ALCO_6_539T_Notch8", 0.50F, 40, "ALCO_6_539T_Idle", 0.65F, 40, true, " ", 0),
	//JCTC Baldwin Diesel
	DieselVO1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselVO1000.class,"wabco_e2", 2.5F, "Baldwin_8VO_Notch8", 1F, 8, "Baldwin_8VO_Idle", 1F, 50, false, " ", 0),
	//JCTC EMD Diesels
	DieselBeep(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBeep.class,"leslie_s3lr", 2.5F, "EMD_16_567BC_Idle", 0.7F, 40, "EMD_16_567BC_Notch8", 0.7F, 60, false, " ", 0),
	DieselCF7angle(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7angle.class, "nathan_k3la", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true, " ", 0),
	DieselCF7round(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7round.class, "leslie_s3lr", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true, " ", 0),
	DieselCF7angle2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7angle2.class, "prime_920_2", 0.8F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true, " ", 0),
	DieselF3A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF3A.class, "leslie_a200_3", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true, " ", 0),
	DieselF7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7A.class, "leslie_a200_4", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true, " ", 0),
	DieselF7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7B.class, "leslie_a200_2", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true, " ", 0),
	DieselEMDE7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE7A.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true, " ", 0),
	DieselEMDE7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE7B.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true, " ", 0),
	DieselE8A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8A.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true, " ", 0),
	DieselE8B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8B.class, " ", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true, " ", 0),
	DieselE9A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9A.class, "leslie_a200", 1F, "EMD_12_567C_Notch8", 0.45F, 15, "EMD_16_567C_Idle", 0.75F, 3, true, " ", 0),
	DieselE9B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9B.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 15, "EMD_16_567C_Idle", 0.75F, 3, true, " ", 0),
	DieselF40PH(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF40PH.class, "nathan_k5la_5", 1F, "EMD_16_645E3_Notch8", 0.9F, 8, "EMD_16_645E3_Notch3", 0.7F, 50, false, " ", 0),
	DieselF45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF45.class,"leslie_s3", 2.5F, "EMD_20_645E3_Notch8", 1F, 8, "EMD_20_645E3_Idle", 1F, 50, false, " ", 0),
	DieselFP45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP45.class,"leslie_rs5t", 2.5F, "EMD_20_645E3_Notch8", 1F, 8, "EMD_20_645E3_Idle", 1F, 50, false, " ", 0),
	DieselGP7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7.class, "nathan_m5_2", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false, " ", 0),
	DieselGP7old(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7old.class, "nathan_m5", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false, " ", 0),
	DieselGP7b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7b.class, "leslie_a200", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false, " ", 0),
	DieselGP7u(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7u.class, "nathan_k3la_2", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false, " ", 0),
	DieselGP9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9.class, "nathan_m3_3", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false, " ", 0),
	DieselGP9old(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9old.class, "nathan_m3", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false, " ", 0),
	DieselGP13(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP13.class, "nathan_p6", 0.8F, "EMD_16_645E3_Notch8", 0.65F, 35, "EMD_16_645E3_Idle", 0.65F, 40, false, " ", 0),
	DieselGP15(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP15.class,"nathan_k3ha", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false, " ", 0),
	DieselGP30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP30.class, "nathan_p5", 0.8F, "EMD_16_567D3_Notch8", 0.65F, 35, "EMD_16_567D3_Idle", 0.65F, 40, false, " ", 0),
	DieselGP38(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38.class, "nathan_k3la_3", 0.8F, "EMD_16_645E_Notch8", 0.55F, 35, "EMD_16_645E_Idle", 0.55F, 40, false, " ", 0),
	DieselGP38dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38dash2.class, "nathan_k3la_3", 0.8F, "EMD_16_645E_Notch8", 0.55F, 35, "EMD_16_645E_Idle", 0.55F, 40, false, " ", 0),
	DieselGP38H3(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38H3.class, "nathan_k5la_5", 1F, "EMD_16_645E3_Notch8", 0.9F, 8, "EMD_16_645E3_Idle", 0.7F, 50, false, " ", 0),
	DieselGP39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP39.class, "nathan_k3la_3", 0.8F, "EMD_12_645E3_Notch8", 0.55F, 35, "EMD_12_645E3_Idle", 0.55F, 40, false, " ", 0),
	DieselGP40(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40.class, "nathan_k3la_3", 0.8F, "EMD_16_645E3_Notch8", 0.55F, 35, "EMD_16_645E3_Idle", 0.55F, 40, false, " ", 0),
	DieselGP40TC(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40TC.class, "nathan_k5la_6", 1F, "EMD_16_645E3_Notch8", 0.9F, 8, "EMD_16_645E3_Idle", 0.7F, 50, false, " ", 0),
	DieselGP49(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP49.class, "nathan_p3_4", 0.8F, "EMD_16_645F3B_Idle", 0.55F, 35, "EMD_16_645E_Notch8", 0.55F, 40, false, " ", 0),
	DieselSD9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD9.class, "nathan_m3", 2.5F, "EMD_16_567C_Notch8", 0.45F, 10, "EMD_16_567C_Idle", 0.75F, 3, true, " ", 0),
	DieselSD40dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2.class, "leslie_sl4t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true, " ", 0),
	DieselSDP40P(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40.class, "leslie_sl4t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, false, " ", 0),
	DieselSD40Tdash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40T2.class, "nathan_p5", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true, " ", 0),
	DieselSD45dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2.class, "leslie_rs5t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.65F, 3, true, "bell_test", 15),
	DieselSD45dash2B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2B.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.65F, 3, false, " ", 0),
	DieselSD70M(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70Mac.class, "nathan_k5la_4", 2F, "EMD_16_710G3B_Notch8", 0.5F, 40, "EMD_16_710G3B_Idle", 0.5F, 20, false, " ", 0),
	DieselSDL39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDL39.class, "nathan_m3", 2F, "EMD_12_645E3_Notch8", 0.65F, 10, "EMD_12_645E3_Idle", 0.65F, 3, true, " ", 0),
	DieselSDP40F(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40F.class, "leslie_sl4t", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, false, " ", 0),
	DieselSW1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1.class, "leslie_a200", 0.9F, "EMD_6_567A_Notch8", 0.45F, 40, "EMD_6_567A_Idle", 0.75F, 40, false, " ", 0),
	DieselSW8(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW8.class, "nathan_p3_4", 0.9F, "EMD_12_567B_Notch8", 0.45F, 40, "EMD_12_567B_Idle", 0.75F, 40, false, " ", 0),
	DieselSW1200(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1200.class, "nathan_p3", 0.65F, "EMD_12_645E_Notch8", 0.65F, 10, "EMD_12_645E_Idle", 0.8F, 3, true, " ", 0),
	DieselSD38(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD38.class, "leslie_rs5t", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	DieselSD39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD39.class, "leslie_s3", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	//DieselSD40T(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40T2.class, "nathan_p5", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	DieselSW1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1000.class, "nathan_p5", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	DieselSW1500(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1500.class, "nathan_p3", 0.65F, "EMD_12_645E_Notch8", 0.65F, 10, "EMD_12_645E_Idle", 0.8F, 3, true, " ", 0),
	//JCTC FM Diesels
	DieselH1044(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH1044.class, "wabco_e2", 10F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false, " ", 0),
	DieselFMH16_66(DieselH16_66.class,"leslie_a200_2", 1F,"FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false," ", 0),
	DieselFMH24_66(DieselH24_66.class,"leslie_a200_2", 1F,"FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false," ", 0),
	DieselFMH24_66L(DieselH24_66L.class,"leslie_a200_2", 1F,"FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false," ", 0),
	//JCTC GE Diesels
	Diesel25Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGE25Ton.class, "wabco_e2", 10F, "GE_HBI_600_Notch8", 0.5F, 15, "GE_HBI_600_Idle", 0.5F, 25, false, " ", 0),
	Diesel44Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGE44Ton.class, "hancock_airwhistle", 10F, "CAT_8_D17000_Notch8", 0.5F, 15, "CAT_8_D17000_Idle", 0.5F, 25, false, " ", 0),
	DieselB23(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB23.class, "nathan_m3h", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true, " ", 0),
	DieselB30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB30.class, "nathan_m5", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true, " ", 0),
	DieselBoxcab23Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBoxcab23Ton.class, "wabco_e2", 10F, "GE_HBI_600_Notch8", 0.5F, 15, "GE_HBI_600_Idle", 0.5F, 25, false, " ", 0),
	DieselDash840B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840B.class, "leslie_s3l", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true, " ", 0),
	DieselDash840BB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840BB.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true, " ", 0),
	DieselDash840BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840BW.class, "leslie_s3l", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true, " ", 0),
	DieselDash840C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840C.class, "leslie_s3lr", 2.5F, "GE_FDL16_Notch8", 0.5F, 10, "GE_FDL16_Idle", 0.5F, 3, true, " ", 0),
	DieselDash9C44W(DieselDash944CW.class, "nathan_k3la_4", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true, " ", 0),
	DieselES44(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselES44.class, "nathan_k5hll", 1F, "GE_GEVO_12_Notch8", 0.65F, 20, "GE_GEVO_12_Idle", 0.75F, 50, true, " ", 0),
	GeGenesis(com.jcirmodelsquad.tcjcir.vehicles.locomotives.GeGenesis.class, "nathan_k5la", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true, " ", 0),
	DieselSF30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30C.class, "leslie_s3lr", 2.5F, "GE_FDL16_Notch8", 0.5F, 10, "GE_FDL16_Idle", 0.5F, 3, true, " ", 0),
	DieselU18B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18B.class, "leslie_s3", 2.5F, "GE_7FDL_8_Notch8", 0.35F, 40, "GE_7FDL_8_Idle", 0.35F, 50, true, " ", 0),
	DieselU18BB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BB.class, " ", 2.5F, "GE_7FDL_8_Notch8", 0.25F, 40, "GE_7FDL_8_Idle", 0.35F, 50, true, " ", 0),
	DieselU18BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BW.class, "leslie_s5t_1", 2.5F, "GE_7FDL_8_Notch8", 0.25F, 40, "GE_7FDL_8_Idle", 0.35F, 50, true, " ", 0),
	DieselU23B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23B.class, "leslie_s3l", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true, " ", 0),
	DieselU30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU30C.class, "leslie_s3lr", 2.5F, "GE_7FDL_16_Notch8", 0.5F, 10, "GE_7FDL_16_Idle", 0.5F, 3, true, " ", 0),
	DieselU36C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU36C.class, "leslie_s3lr", 2.5F, "GE_7FDL_16_Notch8", 0.5F, 10, "GE_7FDL_16_Idle", 0.5F, 3, true, " ", 0),
	//JCTC MOW Diesels
	DieselHighrailTruck(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailTruck.class, "truck_horn", 0.8F, "GE_HBI_600_Notch8", 0.65F, 15, "GE_HBI_600_Idle", 0.65F, 25, true, " ", 0),
	DieselHighrailVan(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailVan.class, "truck_horn", 0.8F, "GE_HBI_600_Notch8", 0.65F, 15, "GE_HBI_600_Idle", 0.65F, 25, true, " ", 0),
	//JCTC Misc Manufactures
	Diesel3GS21B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselNRE3gs21b.class,"nathan_k3ha", 2.5F, "QSK19C_Notch8", 0.50F, 40, "QSK19C_Idle", 1.0F, 60, false, " ", 0),
	DieselKrautt(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselKrautt.class,"nathan_p3_3", 2.5F, "Maybach_MD870_16_Notch8", 1F, 8, "Maybach_MD870_16_Idle", 1F, 50, false, " ", 0),
	//JCTC Fictional Diesels
	DieselFOLM1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFOLM1B.class, "", 0.0F,"FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Idle", 0.65F, 40, false, " ", 0),
	DieselGP7f(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7f.class, "prime_920_4", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false, " ", 0),
	DieselGP389W(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38dash9W.class, "nathan_k5la_5", 0.8F, "EMD_16_645E_Notch8", 0.55F, 35, "EMD_16_645E_Idle", 0.55F, 40, false, " ", 0),
	Dieselgtavthing(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Dieselgtavthing.class,"leslie_s3l", 1F, "EMD_16_567D3_Notch8", 0.9F, 8, "EMD_16_567D3_Idle", 0.7F, 50, false, " ", 0),
	DieselHustler(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHustler.class, "wabco3bell", 1F, "Plymouth_V8_Notch8", 0.9F, 8, "Plymouth_V8_Idle", 0.7F, 50, false, " ", 0),
	DieselILMC(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselILMC.class, "eu07_horn", 2.5F, "GE_HBI_600_Notch8", 0.65F, 40, "GE_HBI_600_Idle", 0.65F, 50, true, " ", 0),
	DieselMP15DCW9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselMP15DCW9.class,"leslie_rs3k_2", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false, " ", 0),
	DieselSB23E(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB23E.class, "leslie_s3l_2", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true, "bell_steel", 16),
	DieselSB23R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB23R.class, "prime_920_3", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true, "bell_bronze", 15),
	//JCTC Electrics
	//
	//JCTC EMD Electrics
	ElectricGM6C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricGM6C.class, "leslie_s3l", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true, " ", 0),
	//JCTC ALCO Electrics
	ElectricEF1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true, " ", 0),
	ElectricEF1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1B.class, "leslie_s3l", 0, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true, " ", 0),
	ElectricEP1A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEP1A.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true, " ", 0),
	//JCTC Fictional Electric
	ElectricILMA(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricILMA.class, "eu07_horn", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true, " ", 0),
	ElectricILMB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricILMB.class, "eu07_horn", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true, " ", 0),
	ElectricJT7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricJT7.class, "leslie_a200_3", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true, " ", 0),
	PCH100H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, "nathan_p2", 1F, "pch100h_notch8", 0.6F, 8, "pch100h_idle", 0.4F, 50, false, " ", 0),
	PCH120Commute(PCH120Commute.class, "nathan_p2", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	TestControlCar(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.TestControlCar.class, "nathan_p2", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	//JCTC Foreign Electrics
	ElectricClass345(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricClass345.class, "br_horn", 1F, "mg_run", 0.9F, 8, "mg_idle", 0.7F, 50, false, " ", 0),
	ElectricLUEngine(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricLUengine.class, "lu_whistle", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	//JCTC Steam
	//
	//JCTC Baldwin Steam
	SteamSkook(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamSkook.class,"skookum_whistle", 1F, "skookum_notch8", 0.9F, 8, "skookum_idle", 0.7F, 50, false, " ", 0),
	//JCTC Logging
	SteamVBShay(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamVBShay2.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	Steam2TruckClimax(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamClimaxNew.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	Steam3TruckShay(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamShay3Truck.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	//JCTC Fictional Steam
	SteamPE(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamPELoco.class, "pe_whistle", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	SteamOnion(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamOnion.class, "hancock_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	//JCTC Foreign Steam
	SteamC11(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamC11.class, "jnr_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	//JCTC Meme Stuff
	BigMeme(com.jcirmodelsquad.tcjcir.vehicles.locomotives.BigMeme.class, "leslie_a425", 15, "aircompresser", 0.65F, 50, "aircompresser", 0.65F, 50, false, " ", 0),
	DieselHHGregg(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHHgregg.class,"hhgregg600horn", 2.5F, "hhgregg600_run", 1F, 287, "hhgregg600_idle", 1F, 287, false, " ", 0),
	DieselTGVMobile(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTGVmobile.class, "truck_horn", 1F, "GE_HBI_600_Notch8", 0.9F, 8, "GE_HBI_600_Idle", 0.7F, 50, false, " ", 0),
	Thanos(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Thanos.class, "thanos_horn", 5, "thanos_run", 0.65F, 50, "thanos_idle", 0.65F, 50, false, " ", 0),

	;

	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
	private boolean soundChangeWithSpeed;
	private String bell;
	private int bellLength;

	/**
	 * Defines the Horn, Bell, Idle, and Run Sounds for Locomotives.
	 *
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 * @param bell
	 */
	private EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed, String bell, int bellLength) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
		this.bell = bell;
		this.bellLength = bellLength;
	}
/*
	/**
	 * Defines only the Horn, Idle, and Run Sounds for Locomotives as to not break stuff without bells.
	 *
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	/*private EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}*/

	public Class getEntityClass() {
		return entityClass;
	}

	public String getHornString() {
		return horn;
	}

	public String getRunString() {
		return run;
	}

	public String getIdleString() {
		return idle;
	}

	public Float getHornVolume() {
		return hornVolume;
	}

	public Float getRunVolume() {
		return runVolume;
	}

	public Float getIdleVolume() {
		return idleVolume;
	}

	public int getRunSoundLenght() {
		return runSoundLenght;
	}

	public int getIdleSoundLenght() {
		return idleSoundLenght;
	}

	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}

	public String getBellString() {
		return bell;
	}

	public int getBellLength() {
		return bellLength;
	}
}
