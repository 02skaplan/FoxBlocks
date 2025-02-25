package com.bidahochi.BlockMod.core.handler;

import com.bidahochi.BlockMod.blocks.bridgestuff.*;
import com.bidahochi.BlockMod.blocks.constructionmaterials.RenderBreakerBox;
import com.bidahochi.BlockMod.blocks.constructionmaterials.RenderBreakerBox2;
import com.bidahochi.BlockMod.blocks.constructionmaterials.TileBreakerBox;
import com.bidahochi.BlockMod.blocks.constructionmaterials.TileBreakerBox2;
import com.bidahochi.BlockMod.blocks.constructionmaterials.roadcover.RenderRoadCover0;
import com.bidahochi.BlockMod.blocks.constructionmaterials.roadcover.*;
import com.bidahochi.BlockMod.blocks.lighting.RenderNeonCageLampRoof;
import com.bidahochi.BlockMod.blocks.lighting.*;
import com.bidahochi.BlockMod.blocks.lighting.TileNeonCageLampRoof;
import com.bidahochi.BlockMod.blocks.metals.Scaffold;
import com.bidahochi.BlockMod.blocks.props.*;
import com.bidahochi.BlockMod.render.BlockRenderScaffolds;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderBlockHandler {
    public static int scaffoldRenderId = RenderingRegistry.getNextAvailableRenderId();
    public static void initializeCustomModels() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileBreakerBox.class, new RenderBreakerBox());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBreakerBox2.class, new RenderBreakerBox2());

        ClientRegistry.bindTileEntitySpecialRenderer(TileClampOnSignDerail.class, new RenderClampOnSignDerail());
        ClientRegistry.bindTileEntitySpecialRenderer(TileClampOnSignStop1.class, new RenderClampOnSignStop1());
        ClientRegistry.bindTileEntitySpecialRenderer(TileClampOnSignStop2.class, new RenderClampOnSignStop2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWaysideWarningSignGreen.class, new RenderWaysideWarningSignGreen());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWaysideWarningSignRed.class, new RenderWaysideWarningSignRed());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWaysideWarningSignYellow.class, new RenderWaysideWarningSignYellow());
        ClientRegistry.bindTileEntitySpecialRenderer(TileWaysideWarningSignYellowRed.class, new RenderWaysideWarningSignYellowRed());

        ClientRegistry.bindTileEntitySpecialRenderer(TileNeonCageLampRoof.class, new RenderNeonCageLampRoof());
        ClientRegistry.bindTileEntitySpecialRenderer(TileNeonCageLampWallV.class, new RenderNeonCageLampWallV());
        ClientRegistry.bindTileEntitySpecialRenderer(TileNeonCageLampWallH.class, new RenderNeonCageLampWallH());
        ClientRegistry.bindTileEntitySpecialRenderer(TileExteriorLightSquare.class, new RenderExteriorLightSquare());

        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_Center.class, new RenderBridgeA_Center());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_X_Side_Center_Top.class, new RenderBridgeA_X_Side_Top());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_X_Side_Center_Bottom.class, new RenderBridgeA_X_Side_Bottom());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_X_Side_Center_Top2.class, new RenderBridgeA_X_Side_Top2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_X_Side_Center_Bottom2.class, new RenderBridgeA_X_Side_Bottom2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_Side_Top.class, new RenderBridgeA_Side_Top());
        ClientRegistry.bindTileEntitySpecialRenderer(TileBridgeA_Side_Bottom.class, new RenderBridgeA_Side_Bottom());

        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover0.class, new RenderRoadCover0());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover1.class, new RenderRoadCover1());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover2.class, new RenderRoadCover2());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover3.class, new RenderRoadCover3());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover4.class, new RenderRoadCover4());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover5.class, new RenderRoadCover5());
        ClientRegistry.bindTileEntitySpecialRenderer(TileRoadCover6.class, new RenderRoadCover6());
        RenderingRegistry.registerBlockHandler(scaffoldRenderId, new BlockRenderScaffolds(scaffoldRenderId));
    }
}
