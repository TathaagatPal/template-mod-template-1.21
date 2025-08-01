package net.tathaagat.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tathaagat.tutorialmod.TemplateMod;
import net.tathaagat.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup GOOD_STUFF_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TemplateMod.MOD_ID,"good_stuff_item"),FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BIG_RAT))
                            .displayName(Text.translatable("itemgroup.templatemod.good_stuff_item"))
                            .entries((displayContext, entries) -> {
                                entries.add(ModItems.HACKINGTONS_LOGO);
                                entries.add(ModItems.BIG_RAT);
                                entries.add(ModItems.RAW_PINK_GARNET);
                                entries.add(ModItems.PINK_GARNET);

                                entries.add(ModBlocks.HACKINGTONS_BLOCK);
                                entries.add(ModBlocks.PINK_GARNET_BLOCK);
                                entries.add(ModBlocks.BIG_RAT_BLOCK);
                                entries.add(ModBlocks.COOL_BLOCK);
                            })
                    .build());

    public static void registerItemGroups(){
        TemplateMod.LOGGER.info("Registring item groups for:"+TemplateMod.MOD_ID);
    }
}
