package com.yurisuika.branched.registry;

import com.yurisuika.branched.Branched;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistry {

    public static void registerFlammables() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(Branched.OAK_TRUNK, 5, 5);
        registry.add(Branched.OAK_BRANCH, 10, 20);
        registry.add(Branched.OAK_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_OAK_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_OAK_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_OAK_TWIG, 20, 40);

        registry.add(Branched.SPRUCE_TRUNK, 5, 5);
        registry.add(Branched.SPRUCE_BRANCH, 10, 20);
        registry.add(Branched.SPRUCE_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_SPRUCE_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_SPRUCE_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_SPRUCE_TWIG, 20, 40);

        registry.add(Branched.BIRCH_TRUNK, 5, 5);
        registry.add(Branched.BIRCH_BRANCH, 10, 20);
        registry.add(Branched.BIRCH_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_BIRCH_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_BIRCH_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_BIRCH_TWIG, 20, 40);

        registry.add(Branched.JUNGLE_TRUNK, 5, 5);
        registry.add(Branched.JUNGLE_BRANCH, 10, 20);
        registry.add(Branched.JUNGLE_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_JUNGLE_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_JUNGLE_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_JUNGLE_TWIG, 20, 40);

        registry.add(Branched.ACACIA_TRUNK, 5, 5);
        registry.add(Branched.ACACIA_BRANCH, 10, 20);
        registry.add(Branched.ACACIA_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_ACACIA_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_ACACIA_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_ACACIA_TWIG, 20, 40);

        registry.add(Branched.DARK_OAK_TRUNK, 5, 5);
        registry.add(Branched.DARK_OAK_BRANCH, 10, 20);
        registry.add(Branched.DARK_OAK_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_DARK_OAK_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_DARK_OAK_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_DARK_OAK_TWIG, 20, 40);

        registry.add(Branched.ALDER_TRUNK, 5, 5);
        registry.add(Branched.ALDER_BRANCH, 10, 20);
        registry.add(Branched.ALDER_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_ALDER_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_ALDER_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_ALDER_TWIG, 20, 40);

        registry.add(Branched.APPLE_TRUNK, 5, 5);
        registry.add(Branched.APPLE_BRANCH, 10, 20);
        registry.add(Branched.APPLE_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_APPLE_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_APPLE_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_APPLE_TWIG, 20, 40);

        registry.add(Branched.ASH_TRUNK, 5, 5);
        registry.add(Branched.ASH_BRANCH, 10, 20);
        registry.add(Branched.ASH_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_ASH_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_ASH_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_ASH_TWIG, 20, 40);

        registry.add(Branched.ASPEN_TRUNK, 5, 5);
        registry.add(Branched.ASPEN_BRANCH, 10, 20);
        registry.add(Branched.ASPEN_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_ASPEN_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_ASPEN_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_ASPEN_TWIG, 20, 40);

        registry.add(Branched.CEDAR_TRUNK, 5, 5);
        registry.add(Branched.CEDAR_BRANCH, 10, 20);
        registry.add(Branched.CEDAR_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_CEDAR_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_CEDAR_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_CEDAR_TWIG, 20, 40);

        registry.add(Branched.CHERRY_TRUNK, 5, 5);
        registry.add(Branched.CHERRY_BRANCH, 10, 20);
        registry.add(Branched.CHERRY_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_CHERRY_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_CHERRY_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_CHERRY_TWIG, 20, 40);

        registry.add(Branched.CHESTNUT_TRUNK, 5, 5);
        registry.add(Branched.CHESTNUT_BRANCH, 10, 20);
        registry.add(Branched.CHESTNUT_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_CHESTNUT_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_CHESTNUT_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_CHESTNUT_TWIG, 20, 40);

        registry.add(Branched.CITRUS_TRUNK, 5, 5);
        registry.add(Branched.CITRUS_BRANCH, 10, 20);
        registry.add(Branched.CITRUS_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_CITRUS_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_CITRUS_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_CITRUS_TWIG, 20, 40);

        registry.add(Branched.COTTONWOOD_TRUNK, 5, 5);
        registry.add(Branched.COTTONWOOD_BRANCH, 10, 20);
        registry.add(Branched.COTTONWOOD_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_COTTONWOOD_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_COTTONWOOD_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_COTTONWOOD_TWIG, 20, 40);

        registry.add(Branched.CYPRESS_TRUNK, 5, 5);
        registry.add(Branched.CYPRESS_BRANCH, 10, 20);
        registry.add(Branched.CYPRESS_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_CYPRESS_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_CYPRESS_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_CYPRESS_TWIG, 20, 40);

        registry.add(Branched.EBONY_TRUNK, 5, 5);
        registry.add(Branched.EBONY_BRANCH, 10, 20);
        registry.add(Branched.EBONY_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_EBONY_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_EBONY_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_EBONY_TWIG, 20, 40);

        registry.add(Branched.FIR_TRUNK, 5, 5);
        registry.add(Branched.FIR_BRANCH, 10, 20);
        registry.add(Branched.FIR_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_FIR_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_FIR_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_FIR_TWIG, 20, 40);

        registry.add(Branched.GUM_TRUNK, 5, 5);
        registry.add(Branched.GUM_BRANCH, 10, 20);
        registry.add(Branched.GUM_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_GUM_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_GUM_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_GUM_TWIG, 20, 40);

        registry.add(Branched.HAWTHORN_TRUNK, 5, 5);
        registry.add(Branched.HAWTHORN_BRANCH, 10, 20);
        registry.add(Branched.HAWTHORN_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_HAWTHORN_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_HAWTHORN_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_HAWTHORN_TWIG, 20, 40);

        registry.add(Branched.HAZEL_TRUNK, 5, 5);
        registry.add(Branched.HAZEL_BRANCH, 10, 20);
        registry.add(Branched.HAZEL_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_HAZEL_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_HAZEL_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_HAZEL_TWIG, 20, 40);

        registry.add(Branched.HEMLOCK_TRUNK, 5, 5);
        registry.add(Branched.HEMLOCK_BRANCH, 10, 20);
        registry.add(Branched.HEMLOCK_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_HEMLOCK_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_HEMLOCK_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_HEMLOCK_TWIG, 20, 40);

        registry.add(Branched.HICKORY_TRUNK, 5, 5);
        registry.add(Branched.HICKORY_BRANCH, 10, 20);
        registry.add(Branched.HICKORY_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_HICKORY_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_HICKORY_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_HICKORY_TWIG, 20, 40);

        registry.add(Branched.JUNIPER_TRUNK, 5, 5);
        registry.add(Branched.JUNIPER_BRANCH, 10, 20);
        registry.add(Branched.JUNIPER_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_JUNIPER_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_JUNIPER_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_JUNIPER_TWIG, 20, 40);

        registry.add(Branched.LARCH_TRUNK, 5, 5);
        registry.add(Branched.LARCH_BRANCH, 10, 20);
        registry.add(Branched.LARCH_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_LARCH_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_LARCH_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_LARCH_TWIG, 20, 40);

        registry.add(Branched.MAHOGANY_TRUNK, 5, 5);
        registry.add(Branched.MAHOGANY_BRANCH, 10, 20);
        registry.add(Branched.MAHOGANY_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_MAHOGANY_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_MAHOGANY_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_MAHOGANY_TWIG, 20, 40);

        registry.add(Branched.MAPLE_TRUNK, 5, 5);
        registry.add(Branched.MAPLE_BRANCH, 10, 20);
        registry.add(Branched.MAPLE_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_MAPLE_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_MAPLE_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_MAPLE_TWIG, 20, 40);

        registry.add(Branched.MESQUITE_TRUNK, 5, 5);
        registry.add(Branched.MESQUITE_BRANCH, 10, 20);
        registry.add(Branched.MESQUITE_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_MESQUITE_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_MESQUITE_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_MESQUITE_TWIG, 20, 40);

        registry.add(Branched.PEACH_TRUNK, 5, 5);
        registry.add(Branched.PEACH_BRANCH, 10, 20);
        registry.add(Branched.PEACH_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_PEACH_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_PEACH_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_PEACH_TWIG, 20, 40);

        registry.add(Branched.PEAR_TRUNK, 5, 5);
        registry.add(Branched.PEAR_BRANCH, 10, 20);
        registry.add(Branched.PEAR_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_PEAR_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_PEAR_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_PEAR_TWIG, 20, 40);

        registry.add(Branched.PINE_TRUNK, 5, 5);
        registry.add(Branched.PINE_BRANCH, 10, 20);
        registry.add(Branched.PINE_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_PINE_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_PINE_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_PINE_TWIG, 20, 40);

        registry.add(Branched.REDWOOD_TRUNK, 5, 5);
        registry.add(Branched.REDWOOD_BRANCH, 10, 20);
        registry.add(Branched.REDWOOD_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_REDWOOD_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_REDWOOD_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_REDWOOD_TWIG, 20, 40);

        registry.add(Branched.ROSEWOOD_TRUNK, 5, 5);
        registry.add(Branched.ROSEWOOD_BRANCH, 10, 20);
        registry.add(Branched.ROSEWOOD_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_ROSEWOOD_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_ROSEWOOD_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_ROSEWOOD_TWIG, 20, 40);

        registry.add(Branched.TEAK_TRUNK, 5, 5);
        registry.add(Branched.TEAK_BRANCH, 10, 20);
        registry.add(Branched.TEAK_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_TEAK_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_TEAK_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_TEAK_TWIG, 20, 40);

        registry.add(Branched.WALNUT_TRUNK, 5, 5);
        registry.add(Branched.WALNUT_BRANCH, 10, 20);
        registry.add(Branched.WALNUT_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_WALNUT_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_WALNUT_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_WALNUT_TWIG, 20, 40);

        registry.add(Branched.WILLOW_TRUNK, 5, 5);
        registry.add(Branched.WILLOW_BRANCH, 10, 20);
        registry.add(Branched.WILLOW_TWIG, 20, 40);
        registry.add(Branched.STRIPPED_WILLOW_TRUNK, 5, 5);
        registry.add(Branched.STRIPPED_WILLOW_BRANCH, 10, 20);
        registry.add(Branched.STRIPPED_WILLOW_TWIG, 20, 40);
    }

}
