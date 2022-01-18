package com.yurisuika.branched;

import com.yurisuika.branched.block.*;
import com.yurisuika.branched.item.ModItemGroup;
import com.yurisuika.branched.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Branched implements ModInitializer {

	public static final String MOD_ID = "branched";

	public static final Logger LOGGER = LogManager.getLogger("branched");

	public static final Block STRIPPED_OAK_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_OAK_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_OAK_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block OAK_TWIG = new TwigBlock(STRIPPED_OAK_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block OAK_BRANCH = new BranchBlock(STRIPPED_OAK_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block OAK_TRUNK = new TrunkBlock(STRIPPED_OAK_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_SPRUCE_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_SPRUCE_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_SPRUCE_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block SPRUCE_TWIG = new TwigBlock(STRIPPED_SPRUCE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block SPRUCE_BRANCH = new BranchBlock(STRIPPED_SPRUCE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block SPRUCE_TRUNK = new TrunkBlock(STRIPPED_SPRUCE_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_BIRCH_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_BIRCH_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_BIRCH_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block BIRCH_TWIG = new TwigBlock(STRIPPED_BIRCH_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block BIRCH_BRANCH = new BranchBlock(STRIPPED_BIRCH_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block BIRCH_TRUNK = new TrunkBlock(STRIPPED_BIRCH_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_JUNGLE_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_JUNGLE_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_JUNGLE_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block JUNGLE_TWIG = new TwigBlock(STRIPPED_JUNGLE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block JUNGLE_BRANCH = new BranchBlock(STRIPPED_JUNGLE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block JUNGLE_TRUNK = new TrunkBlock(STRIPPED_JUNGLE_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_ACACIA_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ACACIA_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ACACIA_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block ACACIA_TWIG = new TwigBlock(STRIPPED_ACACIA_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ACACIA_BRANCH = new BranchBlock(STRIPPED_ACACIA_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ACACIA_TRUNK = new TrunkBlock(STRIPPED_ACACIA_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_DARK_OAK_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_DARK_OAK_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_DARK_OAK_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block DARK_OAK_TWIG = new TwigBlock(STRIPPED_DARK_OAK_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block DARK_OAK_BRANCH = new BranchBlock(STRIPPED_DARK_OAK_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block DARK_OAK_TRUNK = new TrunkBlock(STRIPPED_DARK_OAK_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_ALDER_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ALDER_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ALDER_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block ALDER_TWIG = new TwigBlock(STRIPPED_ALDER_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ALDER_BRANCH = new BranchBlock(STRIPPED_ALDER_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ALDER_TRUNK = new TrunkBlock(STRIPPED_ALDER_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_APPLE_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_APPLE_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_APPLE_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block APPLE_TWIG = new TwigBlock(STRIPPED_APPLE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block APPLE_BRANCH = new BranchBlock(STRIPPED_APPLE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block APPLE_TRUNK = new TrunkBlock(STRIPPED_APPLE_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_ASH_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ASH_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ASH_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block ASH_TWIG = new TwigBlock(STRIPPED_ASH_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ASH_BRANCH = new BranchBlock(STRIPPED_ASH_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ASH_TRUNK = new TrunkBlock(STRIPPED_ASH_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_ASPEN_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ASPEN_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ASPEN_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block ASPEN_TWIG = new TwigBlock(STRIPPED_ASPEN_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ASPEN_BRANCH = new BranchBlock(STRIPPED_ASPEN_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ASPEN_TRUNK = new TrunkBlock(STRIPPED_ASPEN_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_CEDAR_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CEDAR_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CEDAR_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block CEDAR_TWIG = new TwigBlock(STRIPPED_CEDAR_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CEDAR_BRANCH = new BranchBlock(STRIPPED_CEDAR_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CEDAR_TRUNK = new TrunkBlock(STRIPPED_CEDAR_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_CHERRY_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CHERRY_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CHERRY_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block CHERRY_TWIG = new TwigBlock(STRIPPED_CHERRY_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CHERRY_BRANCH = new BranchBlock(STRIPPED_CHERRY_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CHERRY_TRUNK = new TrunkBlock(STRIPPED_CHERRY_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_CHESTNUT_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CHESTNUT_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CHESTNUT_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block CHESTNUT_TWIG = new TwigBlock(STRIPPED_CHESTNUT_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CHESTNUT_BRANCH = new BranchBlock(STRIPPED_CHESTNUT_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CHESTNUT_TRUNK = new TrunkBlock(STRIPPED_CHESTNUT_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_CITRUS_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CITRUS_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CITRUS_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block CITRUS_TWIG = new TwigBlock(STRIPPED_CITRUS_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CITRUS_BRANCH = new BranchBlock(STRIPPED_CITRUS_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CITRUS_TRUNK = new TrunkBlock(STRIPPED_CITRUS_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_COTTONWOOD_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_COTTONWOOD_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_COTTONWOOD_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block COTTONWOOD_TWIG = new TwigBlock(STRIPPED_COTTONWOOD_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block COTTONWOOD_BRANCH = new BranchBlock(STRIPPED_COTTONWOOD_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block COTTONWOOD_TRUNK = new TrunkBlock(STRIPPED_COTTONWOOD_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_CYPRESS_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CYPRESS_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_CYPRESS_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block CYPRESS_TWIG = new TwigBlock(STRIPPED_CYPRESS_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CYPRESS_BRANCH = new BranchBlock(STRIPPED_CYPRESS_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block CYPRESS_TRUNK = new TrunkBlock(STRIPPED_CYPRESS_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_EBONY_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_EBONY_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_EBONY_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block EBONY_TWIG = new TwigBlock(STRIPPED_EBONY_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block EBONY_BRANCH = new BranchBlock(STRIPPED_EBONY_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block EBONY_TRUNK = new TrunkBlock(STRIPPED_EBONY_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_FIR_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_FIR_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_FIR_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block FIR_TWIG = new TwigBlock(STRIPPED_FIR_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block FIR_BRANCH = new BranchBlock(STRIPPED_FIR_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block FIR_TRUNK = new TrunkBlock(STRIPPED_FIR_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_GUM_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_GUM_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_GUM_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block GUM_TWIG = new TwigBlock(STRIPPED_GUM_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block GUM_BRANCH = new BranchBlock(STRIPPED_GUM_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block GUM_TRUNK = new TrunkBlock(STRIPPED_GUM_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_HAWTHORN_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_HAWTHORN_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_HAWTHORN_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block HAWTHORN_TWIG = new TwigBlock(STRIPPED_HAWTHORN_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block HAWTHORN_BRANCH = new BranchBlock(STRIPPED_HAWTHORN_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block HAWTHORN_TRUNK = new TrunkBlock(STRIPPED_HAWTHORN_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_HAZEL_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_HAZEL_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_HAZEL_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block HAZEL_TWIG = new TwigBlock(STRIPPED_HAZEL_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block HAZEL_BRANCH = new BranchBlock(STRIPPED_HAZEL_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block HAZEL_TRUNK = new TrunkBlock(STRIPPED_HAZEL_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_HEMLOCK_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_HEMLOCK_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_HEMLOCK_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block HEMLOCK_TWIG = new TwigBlock(STRIPPED_HEMLOCK_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block HEMLOCK_BRANCH = new BranchBlock(STRIPPED_HEMLOCK_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block HEMLOCK_TRUNK = new TrunkBlock(STRIPPED_HEMLOCK_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_HICKORY_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_HICKORY_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_HICKORY_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block HICKORY_TWIG = new TwigBlock(STRIPPED_HICKORY_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block HICKORY_BRANCH = new BranchBlock(STRIPPED_HICKORY_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block HICKORY_TRUNK = new TrunkBlock(STRIPPED_HICKORY_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_JUNIPER_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_JUNIPER_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_JUNIPER_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block JUNIPER_TWIG = new TwigBlock(STRIPPED_JUNIPER_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block JUNIPER_BRANCH = new BranchBlock(STRIPPED_JUNIPER_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block JUNIPER_TRUNK = new TrunkBlock(STRIPPED_JUNIPER_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_LARCH_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_LARCH_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_LARCH_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block LARCH_TWIG = new TwigBlock(STRIPPED_LARCH_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block LARCH_BRANCH = new BranchBlock(STRIPPED_LARCH_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block LARCH_TRUNK = new TrunkBlock(STRIPPED_LARCH_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_MAHOGANY_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_MAHOGANY_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_MAHOGANY_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block MAHOGANY_TWIG = new TwigBlock(STRIPPED_MAHOGANY_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block MAHOGANY_BRANCH = new BranchBlock(STRIPPED_MAHOGANY_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block MAHOGANY_TRUNK = new TrunkBlock(STRIPPED_MAHOGANY_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_MAPLE_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_MAPLE_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_MAPLE_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block MAPLE_TWIG = new TwigBlock(STRIPPED_MAPLE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block MAPLE_BRANCH = new BranchBlock(STRIPPED_MAPLE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block MAPLE_TRUNK = new TrunkBlock(STRIPPED_MAPLE_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_MESQUITE_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_MESQUITE_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_MESQUITE_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block MESQUITE_TWIG = new TwigBlock(STRIPPED_MESQUITE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block MESQUITE_BRANCH = new BranchBlock(STRIPPED_MESQUITE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block MESQUITE_TRUNK = new TrunkBlock(STRIPPED_MESQUITE_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_PEACH_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_PEACH_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_PEACH_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block PEACH_TWIG = new TwigBlock(STRIPPED_PEACH_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block PEACH_BRANCH = new BranchBlock(STRIPPED_PEACH_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block PEACH_TRUNK = new TrunkBlock(STRIPPED_PEACH_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_PEAR_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_PEAR_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_PEAR_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block PEAR_TWIG = new TwigBlock(STRIPPED_PEAR_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block PEAR_BRANCH = new BranchBlock(STRIPPED_PEAR_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block PEAR_TRUNK = new TrunkBlock(STRIPPED_PEAR_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_PINE_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_PINE_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_PINE_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block PINE_TWIG = new TwigBlock(STRIPPED_PINE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block PINE_BRANCH = new BranchBlock(STRIPPED_PINE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block PINE_TRUNK = new TrunkBlock(STRIPPED_PINE_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_REDWOOD_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_REDWOOD_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_REDWOOD_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block REDWOOD_TWIG = new TwigBlock(STRIPPED_REDWOOD_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block REDWOOD_BRANCH = new BranchBlock(STRIPPED_REDWOOD_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block REDWOOD_TRUNK = new TrunkBlock(STRIPPED_REDWOOD_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_ROSEWOOD_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ROSEWOOD_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ROSEWOOD_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block ROSEWOOD_TWIG = new TwigBlock(STRIPPED_ROSEWOOD_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ROSEWOOD_BRANCH = new BranchBlock(STRIPPED_ROSEWOOD_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ROSEWOOD_TRUNK = new TrunkBlock(STRIPPED_ROSEWOOD_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_TEAK_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_TEAK_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_TEAK_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block TEAK_TWIG = new TwigBlock(STRIPPED_TEAK_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block TEAK_BRANCH = new BranchBlock(STRIPPED_TEAK_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block TEAK_TRUNK = new TrunkBlock(STRIPPED_TEAK_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_WALNUT_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_WALNUT_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_WALNUT_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block WALNUT_TWIG = new TwigBlock(STRIPPED_WALNUT_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block WALNUT_BRANCH = new BranchBlock(STRIPPED_WALNUT_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block WALNUT_TRUNK = new TrunkBlock(STRIPPED_WALNUT_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	
	public static final Block STRIPPED_WILLOW_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_WILLOW_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_WILLOW_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block WILLOW_TWIG = new TwigBlock(STRIPPED_WILLOW_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block WILLOW_BRANCH = new BranchBlock(STRIPPED_WILLOW_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block WILLOW_TRUNK = new TrunkBlock(STRIPPED_WILLOW_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	@Override
	public void onInitialize() {
		LOGGER.info("Nature's bosom flows into your cup!");

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_trunk"), OAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_branch"), OAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_twig"), OAK_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_trunk"), STRIPPED_OAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_branch"), STRIPPED_OAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_twig"), STRIPPED_OAK_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_trunk"), new BlockItem(OAK_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_branch"), new BlockItem(OAK_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_twig"), new BlockItem(OAK_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_trunk"), new BlockItem(STRIPPED_OAK_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_branch"), new BlockItem(STRIPPED_OAK_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_twig"), new BlockItem(STRIPPED_OAK_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_trunk"), SPRUCE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_branch"), SPRUCE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_twig"), SPRUCE_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_trunk"), STRIPPED_SPRUCE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_branch"), STRIPPED_SPRUCE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_twig"), STRIPPED_SPRUCE_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_trunk"), new BlockItem(SPRUCE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_branch"), new BlockItem(SPRUCE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_twig"), new BlockItem(SPRUCE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_trunk"), new BlockItem(STRIPPED_SPRUCE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_branch"), new BlockItem(STRIPPED_SPRUCE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_twig"), new BlockItem(STRIPPED_SPRUCE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_trunk"), BIRCH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_branch"), BIRCH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_twig"), BIRCH_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_trunk"), STRIPPED_BIRCH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_branch"), STRIPPED_BIRCH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_twig"), STRIPPED_BIRCH_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_trunk"), new BlockItem(BIRCH_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_branch"), new BlockItem(BIRCH_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_twig"), new BlockItem(BIRCH_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_trunk"), new BlockItem(STRIPPED_BIRCH_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_branch"), new BlockItem(STRIPPED_BIRCH_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_twig"), new BlockItem(STRIPPED_BIRCH_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_trunk"), JUNGLE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_branch"), JUNGLE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_twig"), JUNGLE_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_trunk"), STRIPPED_JUNGLE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_branch"), STRIPPED_JUNGLE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_twig"), STRIPPED_JUNGLE_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_trunk"), new BlockItem(JUNGLE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_branch"), new BlockItem(JUNGLE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_twig"), new BlockItem(JUNGLE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_trunk"), new BlockItem(STRIPPED_JUNGLE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_branch"), new BlockItem(STRIPPED_JUNGLE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_twig"), new BlockItem(STRIPPED_JUNGLE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_trunk"), ACACIA_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_branch"), ACACIA_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_twig"), ACACIA_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_trunk"), STRIPPED_ACACIA_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_branch"), STRIPPED_ACACIA_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_twig"), STRIPPED_ACACIA_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_trunk"), new BlockItem(ACACIA_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_branch"), new BlockItem(ACACIA_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_twig"), new BlockItem(ACACIA_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_trunk"), new BlockItem(STRIPPED_ACACIA_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_branch"), new BlockItem(STRIPPED_ACACIA_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_twig"), new BlockItem(STRIPPED_ACACIA_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_trunk"), DARK_OAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_branch"), DARK_OAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_twig"), DARK_OAK_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_trunk"), STRIPPED_DARK_OAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_branch"), STRIPPED_DARK_OAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_twig"), STRIPPED_DARK_OAK_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_trunk"), new BlockItem(DARK_OAK_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_branch"), new BlockItem(DARK_OAK_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_twig"), new BlockItem(DARK_OAK_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_trunk"), new BlockItem(STRIPPED_DARK_OAK_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_branch"), new BlockItem(STRIPPED_DARK_OAK_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_twig"), new BlockItem(STRIPPED_DARK_OAK_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "alder_trunk"), ALDER_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "alder_branch"), ALDER_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "alder_twig"), ALDER_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_alder_trunk"), STRIPPED_ALDER_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_alder_branch"), STRIPPED_ALDER_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_alder_twig"), STRIPPED_ALDER_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "alder_trunk"), new BlockItem(ALDER_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "alder_branch"), new BlockItem(ALDER_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "alder_twig"), new BlockItem(ALDER_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_alder_trunk"), new BlockItem(STRIPPED_ALDER_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_alder_branch"), new BlockItem(STRIPPED_ALDER_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_alder_twig"), new BlockItem(STRIPPED_ALDER_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_trunk"), APPLE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_branch"), APPLE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_twig"), APPLE_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_apple_trunk"), STRIPPED_APPLE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_apple_branch"), STRIPPED_APPLE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_apple_twig"), STRIPPED_APPLE_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_trunk"), new BlockItem(APPLE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_branch"), new BlockItem(APPLE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_twig"), new BlockItem(APPLE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_apple_trunk"), new BlockItem(STRIPPED_APPLE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_apple_branch"), new BlockItem(STRIPPED_APPLE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_apple_twig"), new BlockItem(STRIPPED_APPLE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ash_trunk"), ASH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ash_branch"), ASH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ash_twig"), ASH_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_ash_trunk"), STRIPPED_ASH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_ash_branch"), STRIPPED_ASH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_ash_twig"), STRIPPED_ASH_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ash_trunk"), new BlockItem(ASH_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ash_branch"), new BlockItem(ASH_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ash_twig"), new BlockItem(ASH_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_ash_trunk"), new BlockItem(STRIPPED_ASH_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_ash_branch"), new BlockItem(STRIPPED_ASH_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_ash_twig"), new BlockItem(STRIPPED_ASH_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "aspen_trunk"), ASPEN_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "aspen_branch"), ASPEN_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "aspen_twig"), ASPEN_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_aspen_trunk"), STRIPPED_ASPEN_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_aspen_branch"), STRIPPED_ASPEN_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_aspen_twig"), STRIPPED_ASPEN_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "aspen_trunk"), new BlockItem(ASPEN_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "aspen_branch"), new BlockItem(ASPEN_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "aspen_twig"), new BlockItem(ASPEN_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_aspen_trunk"), new BlockItem(STRIPPED_ASPEN_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_aspen_branch"), new BlockItem(STRIPPED_ASPEN_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_aspen_twig"), new BlockItem(STRIPPED_ASPEN_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cedar_trunk"), CEDAR_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cedar_branch"), CEDAR_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cedar_twig"), CEDAR_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cedar_trunk"), STRIPPED_CEDAR_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cedar_branch"), STRIPPED_CEDAR_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cedar_twig"), STRIPPED_CEDAR_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cedar_trunk"), new BlockItem(CEDAR_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cedar_branch"), new BlockItem(CEDAR_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cedar_twig"), new BlockItem(CEDAR_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cedar_trunk"), new BlockItem(STRIPPED_CEDAR_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cedar_branch"), new BlockItem(STRIPPED_CEDAR_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cedar_twig"), new BlockItem(STRIPPED_CEDAR_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cherry_trunk"), CHERRY_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cherry_branch"), CHERRY_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cherry_twig"), CHERRY_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cherry_trunk"), STRIPPED_CHERRY_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cherry_branch"), STRIPPED_CHERRY_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cherry_twig"), STRIPPED_CHERRY_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cherry_trunk"), new BlockItem(CHERRY_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cherry_branch"), new BlockItem(CHERRY_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cherry_twig"), new BlockItem(CHERRY_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cherry_trunk"), new BlockItem(STRIPPED_CHERRY_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cherry_branch"), new BlockItem(STRIPPED_CHERRY_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cherry_twig"), new BlockItem(STRIPPED_CHERRY_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chestnut_trunk"), CHESTNUT_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chestnut_branch"), CHESTNUT_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chestnut_twig"), CHESTNUT_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_chestnut_trunk"), STRIPPED_CHESTNUT_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_chestnut_branch"), STRIPPED_CHESTNUT_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_chestnut_twig"), STRIPPED_CHESTNUT_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chestnut_trunk"), new BlockItem(CHESTNUT_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chestnut_branch"), new BlockItem(CHESTNUT_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chestnut_twig"), new BlockItem(CHESTNUT_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_chestnut_trunk"), new BlockItem(STRIPPED_CHESTNUT_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_chestnut_branch"), new BlockItem(STRIPPED_CHESTNUT_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_chestnut_twig"), new BlockItem(STRIPPED_CHESTNUT_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "citrus_trunk"), CITRUS_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "citrus_branch"), CITRUS_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "citrus_twig"), CITRUS_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_citrus_trunk"), STRIPPED_CITRUS_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_citrus_branch"), STRIPPED_CITRUS_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_citrus_twig"), STRIPPED_CITRUS_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "citrus_trunk"), new BlockItem(CITRUS_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "citrus_branch"), new BlockItem(CITRUS_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "citrus_twig"), new BlockItem(CITRUS_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_citrus_trunk"), new BlockItem(STRIPPED_CITRUS_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_citrus_branch"), new BlockItem(STRIPPED_CITRUS_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_citrus_twig"), new BlockItem(STRIPPED_CITRUS_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cottonwood_trunk"), COTTONWOOD_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cottonwood_branch"), COTTONWOOD_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cottonwood_twig"), COTTONWOOD_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cottonwood_trunk"), STRIPPED_COTTONWOOD_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cottonwood_branch"), STRIPPED_COTTONWOOD_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cottonwood_twig"), STRIPPED_COTTONWOOD_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cottonwood_trunk"), new BlockItem(COTTONWOOD_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cottonwood_branch"), new BlockItem(COTTONWOOD_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cottonwood_twig"), new BlockItem(COTTONWOOD_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cottonwood_trunk"), new BlockItem(STRIPPED_COTTONWOOD_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cottonwood_branch"), new BlockItem(STRIPPED_COTTONWOOD_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cottonwood_twig"), new BlockItem(STRIPPED_COTTONWOOD_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cypress_trunk"), CYPRESS_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cypress_branch"), CYPRESS_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cypress_twig"), CYPRESS_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cypress_trunk"), STRIPPED_CYPRESS_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cypress_branch"), STRIPPED_CYPRESS_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_cypress_twig"), STRIPPED_CYPRESS_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cypress_trunk"), new BlockItem(CYPRESS_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cypress_branch"), new BlockItem(CYPRESS_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cypress_twig"), new BlockItem(CYPRESS_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cypress_trunk"), new BlockItem(STRIPPED_CYPRESS_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cypress_branch"), new BlockItem(STRIPPED_CYPRESS_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_cypress_twig"), new BlockItem(STRIPPED_CYPRESS_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ebony_trunk"), EBONY_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ebony_branch"), EBONY_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "ebony_twig"), EBONY_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_ebony_trunk"), STRIPPED_EBONY_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_ebony_branch"), STRIPPED_EBONY_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_ebony_twig"), STRIPPED_EBONY_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ebony_trunk"), new BlockItem(EBONY_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ebony_branch"), new BlockItem(EBONY_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ebony_twig"), new BlockItem(EBONY_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_ebony_trunk"), new BlockItem(STRIPPED_EBONY_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_ebony_branch"), new BlockItem(STRIPPED_EBONY_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_ebony_twig"), new BlockItem(STRIPPED_EBONY_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_trunk"), FIR_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_branch"), FIR_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_twig"), FIR_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_fir_trunk"), STRIPPED_FIR_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_fir_branch"), STRIPPED_FIR_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_fir_twig"), STRIPPED_FIR_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_trunk"), new BlockItem(FIR_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_branch"), new BlockItem(FIR_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_twig"), new BlockItem(FIR_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_fir_trunk"), new BlockItem(STRIPPED_FIR_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_fir_branch"), new BlockItem(STRIPPED_FIR_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_fir_twig"), new BlockItem(STRIPPED_FIR_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gum_trunk"), GUM_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gum_branch"), GUM_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gum_twig"), GUM_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_gum_trunk"), STRIPPED_GUM_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_gum_branch"), STRIPPED_GUM_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_gum_twig"), STRIPPED_GUM_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gum_trunk"), new BlockItem(GUM_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gum_branch"), new BlockItem(GUM_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gum_twig"), new BlockItem(GUM_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_gum_trunk"), new BlockItem(STRIPPED_GUM_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_gum_branch"), new BlockItem(STRIPPED_GUM_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_gum_twig"), new BlockItem(STRIPPED_GUM_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hawthorn_trunk"), HAWTHORN_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hawthorn_branch"), HAWTHORN_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hawthorn_twig"), HAWTHORN_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hawthorn_trunk"), STRIPPED_HAWTHORN_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hawthorn_branch"), STRIPPED_HAWTHORN_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hawthorn_twig"), STRIPPED_HAWTHORN_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hawthorn_trunk"), new BlockItem(HAWTHORN_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hawthorn_branch"), new BlockItem(HAWTHORN_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hawthorn_twig"), new BlockItem(HAWTHORN_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hawthorn_trunk"), new BlockItem(STRIPPED_HAWTHORN_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hawthorn_branch"), new BlockItem(STRIPPED_HAWTHORN_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hawthorn_twig"), new BlockItem(STRIPPED_HAWTHORN_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hazel_trunk"), HAZEL_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hazel_branch"), HAZEL_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hazel_twig"), HAZEL_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hazel_trunk"), STRIPPED_HAZEL_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hazel_branch"), STRIPPED_HAZEL_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hazel_twig"), STRIPPED_HAZEL_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hazel_trunk"), new BlockItem(HAZEL_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hazel_branch"), new BlockItem(HAZEL_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hazel_twig"), new BlockItem(HAZEL_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hazel_trunk"), new BlockItem(STRIPPED_HAZEL_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hazel_branch"), new BlockItem(STRIPPED_HAZEL_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hazel_twig"), new BlockItem(STRIPPED_HAZEL_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hemlock_trunk"), HEMLOCK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hemlock_branch"), HEMLOCK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hemlock_twig"), HEMLOCK_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hemlock_trunk"), STRIPPED_HEMLOCK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hemlock_branch"), STRIPPED_HEMLOCK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hemlock_twig"), STRIPPED_HEMLOCK_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hemlock_trunk"), new BlockItem(HEMLOCK_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hemlock_branch"), new BlockItem(HEMLOCK_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hemlock_twig"), new BlockItem(HEMLOCK_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hemlock_trunk"), new BlockItem(STRIPPED_HEMLOCK_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hemlock_branch"), new BlockItem(STRIPPED_HEMLOCK_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hemlock_twig"), new BlockItem(STRIPPED_HEMLOCK_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hickory_trunk"), HICKORY_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hickory_branch"), HICKORY_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hickory_twig"), HICKORY_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hickory_trunk"), STRIPPED_HICKORY_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hickory_branch"), STRIPPED_HICKORY_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_hickory_twig"), STRIPPED_HICKORY_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hickory_trunk"), new BlockItem(HICKORY_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hickory_branch"), new BlockItem(HICKORY_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hickory_twig"), new BlockItem(HICKORY_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hickory_trunk"), new BlockItem(STRIPPED_HICKORY_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hickory_branch"), new BlockItem(STRIPPED_HICKORY_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_hickory_twig"), new BlockItem(STRIPPED_HICKORY_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "juniper_trunk"), JUNIPER_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "juniper_branch"), JUNIPER_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "juniper_twig"), JUNIPER_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_juniper_trunk"), STRIPPED_JUNIPER_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_juniper_branch"), STRIPPED_JUNIPER_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_juniper_twig"), STRIPPED_JUNIPER_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "juniper_trunk"), new BlockItem(JUNIPER_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "juniper_branch"), new BlockItem(JUNIPER_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "juniper_twig"), new BlockItem(JUNIPER_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_juniper_trunk"), new BlockItem(STRIPPED_JUNIPER_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_juniper_branch"), new BlockItem(STRIPPED_JUNIPER_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_juniper_twig"), new BlockItem(STRIPPED_JUNIPER_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "larch_trunk"), LARCH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "larch_branch"), LARCH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "larch_twig"), LARCH_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_larch_trunk"), STRIPPED_LARCH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_larch_branch"), STRIPPED_LARCH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_larch_twig"), STRIPPED_LARCH_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "larch_trunk"), new BlockItem(LARCH_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "larch_branch"), new BlockItem(LARCH_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "larch_twig"), new BlockItem(LARCH_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_larch_trunk"), new BlockItem(STRIPPED_LARCH_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_larch_branch"), new BlockItem(STRIPPED_LARCH_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_larch_twig"), new BlockItem(STRIPPED_LARCH_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mahogany_trunk"), MAHOGANY_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mahogany_branch"), MAHOGANY_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mahogany_twig"), MAHOGANY_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_mahogany_trunk"), STRIPPED_MAHOGANY_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_mahogany_branch"), STRIPPED_MAHOGANY_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_mahogany_twig"), STRIPPED_MAHOGANY_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mahogany_trunk"), new BlockItem(MAHOGANY_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mahogany_branch"), new BlockItem(MAHOGANY_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mahogany_twig"), new BlockItem(MAHOGANY_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_mahogany_trunk"), new BlockItem(STRIPPED_MAHOGANY_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_mahogany_branch"), new BlockItem(STRIPPED_MAHOGANY_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_mahogany_twig"), new BlockItem(STRIPPED_MAHOGANY_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "maple_trunk"), MAPLE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "maple_branch"), MAPLE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "maple_twig"), MAPLE_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_maple_trunk"), STRIPPED_MAPLE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_maple_branch"), STRIPPED_MAPLE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_maple_twig"), STRIPPED_MAPLE_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maple_trunk"), new BlockItem(MAPLE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maple_branch"), new BlockItem(MAPLE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maple_twig"), new BlockItem(MAPLE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_maple_trunk"), new BlockItem(STRIPPED_MAPLE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_maple_branch"), new BlockItem(STRIPPED_MAPLE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_maple_twig"), new BlockItem(STRIPPED_MAPLE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mesquite_trunk"), MESQUITE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mesquite_branch"), MESQUITE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mesquite_twig"), MESQUITE_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_mesquite_trunk"), STRIPPED_MESQUITE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_mesquite_branch"), STRIPPED_MESQUITE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_mesquite_twig"), STRIPPED_MESQUITE_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mesquite_trunk"), new BlockItem(MESQUITE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mesquite_branch"), new BlockItem(MESQUITE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mesquite_twig"), new BlockItem(MESQUITE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_mesquite_trunk"), new BlockItem(STRIPPED_MESQUITE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_mesquite_branch"), new BlockItem(STRIPPED_MESQUITE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_mesquite_twig"), new BlockItem(STRIPPED_MESQUITE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "peach_trunk"), PEACH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "peach_branch"), PEACH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "peach_twig"), PEACH_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_peach_trunk"), STRIPPED_PEACH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_peach_branch"), STRIPPED_PEACH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_peach_twig"), STRIPPED_PEACH_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "peach_trunk"), new BlockItem(PEACH_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "peach_branch"), new BlockItem(PEACH_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "peach_twig"), new BlockItem(PEACH_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_peach_trunk"), new BlockItem(STRIPPED_PEACH_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_peach_branch"), new BlockItem(STRIPPED_PEACH_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_peach_twig"), new BlockItem(STRIPPED_PEACH_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pear_trunk"), PEAR_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pear_branch"), PEAR_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pear_twig"), PEAR_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_pear_trunk"), STRIPPED_PEAR_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_pear_branch"), STRIPPED_PEAR_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_pear_twig"), STRIPPED_PEAR_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pear_trunk"), new BlockItem(PEAR_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pear_branch"), new BlockItem(PEAR_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pear_twig"), new BlockItem(PEAR_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_pear_trunk"), new BlockItem(STRIPPED_PEAR_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_pear_branch"), new BlockItem(STRIPPED_PEAR_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_pear_twig"), new BlockItem(STRIPPED_PEAR_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pine_trunk"), PINE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pine_branch"), PINE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pine_twig"), PINE_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_pine_trunk"), STRIPPED_PINE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_pine_branch"), STRIPPED_PINE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_pine_twig"), STRIPPED_PINE_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pine_trunk"), new BlockItem(PINE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pine_branch"), new BlockItem(PINE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pine_twig"), new BlockItem(PINE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_pine_trunk"), new BlockItem(STRIPPED_PINE_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_pine_branch"), new BlockItem(STRIPPED_PINE_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_pine_twig"), new BlockItem(STRIPPED_PINE_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_trunk"), REDWOOD_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_branch"), REDWOOD_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redwood_twig"), REDWOOD_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_redwood_trunk"), STRIPPED_REDWOOD_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_redwood_branch"), STRIPPED_REDWOOD_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_redwood_twig"), STRIPPED_REDWOOD_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_trunk"), new BlockItem(REDWOOD_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_branch"), new BlockItem(REDWOOD_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_twig"), new BlockItem(REDWOOD_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_redwood_trunk"), new BlockItem(STRIPPED_REDWOOD_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_redwood_branch"), new BlockItem(STRIPPED_REDWOOD_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_redwood_twig"), new BlockItem(STRIPPED_REDWOOD_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rosewood_trunk"), ROSEWOOD_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rosewood_branch"), ROSEWOOD_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rosewood_twig"), ROSEWOOD_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_rosewood_trunk"), STRIPPED_ROSEWOOD_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_rosewood_branch"), STRIPPED_ROSEWOOD_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_rosewood_twig"), STRIPPED_ROSEWOOD_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rosewood_trunk"), new BlockItem(ROSEWOOD_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rosewood_branch"), new BlockItem(ROSEWOOD_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rosewood_twig"), new BlockItem(ROSEWOOD_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_rosewood_trunk"), new BlockItem(STRIPPED_ROSEWOOD_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_rosewood_branch"), new BlockItem(STRIPPED_ROSEWOOD_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_rosewood_twig"), new BlockItem(STRIPPED_ROSEWOOD_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "teak_trunk"), TEAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "teak_branch"), TEAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "teak_twig"), TEAK_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_teak_trunk"), STRIPPED_TEAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_teak_branch"), STRIPPED_TEAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_teak_twig"), STRIPPED_TEAK_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "teak_trunk"), new BlockItem(TEAK_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "teak_branch"), new BlockItem(TEAK_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "teak_twig"), new BlockItem(TEAK_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_teak_trunk"), new BlockItem(STRIPPED_TEAK_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_teak_branch"), new BlockItem(STRIPPED_TEAK_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_teak_twig"), new BlockItem(STRIPPED_TEAK_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "walnut_trunk"), WALNUT_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "walnut_branch"), WALNUT_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "walnut_twig"), WALNUT_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_walnut_trunk"), STRIPPED_WALNUT_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_walnut_branch"), STRIPPED_WALNUT_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_walnut_twig"), STRIPPED_WALNUT_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "walnut_trunk"), new BlockItem(WALNUT_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "walnut_branch"), new BlockItem(WALNUT_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "walnut_twig"), new BlockItem(WALNUT_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_walnut_trunk"), new BlockItem(STRIPPED_WALNUT_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_walnut_branch"), new BlockItem(STRIPPED_WALNUT_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_walnut_twig"), new BlockItem(STRIPPED_WALNUT_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "willow_trunk"), WILLOW_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "willow_branch"), WILLOW_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "willow_twig"), WILLOW_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_willow_trunk"), STRIPPED_WILLOW_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_willow_branch"), STRIPPED_WILLOW_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_willow_twig"), STRIPPED_WILLOW_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "willow_trunk"), new BlockItem(WILLOW_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "willow_branch"), new BlockItem(WILLOW_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "willow_twig"), new BlockItem(WILLOW_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_willow_trunk"), new BlockItem(STRIPPED_WILLOW_TRUNK, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_willow_branch"), new BlockItem(STRIPPED_WILLOW_BRANCH, new Item.Settings().group(ModItemGroup.BRANCHED)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_willow_twig"), new BlockItem(STRIPPED_WILLOW_TWIG, new Item.Settings().group(ModItemGroup.BRANCHED)));

		ModRegistry.registerFlammables();

	}

}
