package com.yurisuika.branched.item;

import com.yurisuika.branched.Branched;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BRANCHED = FabricItemGroupBuilder.build(new Identifier(Branched.MOD_ID, "branched"),
            () -> new ItemStack(Branched.OAK_BRANCH));
}
