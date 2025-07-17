package net.tathaagat.tutorialmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.tathaagat.tutorialmod.TemplateMod;



public class ModBlocks {

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",new Block(AbstractBlock.Settings.create().strength(4f).requires().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BIG_RAT_BLOCK = registerBlock("big_rat_block",new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block HACKINGTONS_BLOCK = registerBlock("hackingtons_block",new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,Identifier.of(TemplateMod.MOD_ID, name),block);
    }
    private static void registerBlockItem(String name,Block block){
        Registry.register(Registries.ITEM,Identifier.of(TemplateMod.MOD_ID,name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        TemplateMod.LOGGER.info("Registering mod blocks for"+TemplateMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.BIG_RAT_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.HACKINGTONS_BLOCK);
        });

    }
}
