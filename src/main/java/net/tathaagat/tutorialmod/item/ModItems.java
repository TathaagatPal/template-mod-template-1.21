package net.tathaagat.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tathaagat.tutorialmod.TemplateMod;


public class ModItems {
    public static final Item PINK_GARNET =registerItem("pink_garnet",new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_garnet", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TemplateMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        TemplateMod.LOGGER.info("Registring mod items for: "+TemplateMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(PINK_GARNET);
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
        } );
    }
}
