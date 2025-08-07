package net.naersbunk.sndiapers.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.naersbunk.sndiapers.SNDiapers;

public class ModItems {
    public static final Item DIAPER = registerItem("diaper", new Item(new Item.Settings()));
    public static final Item GOLDFISH = registerItem("goldfish", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SNDiapers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SNDiapers.LOGGER.info("Registering mod items for " + SNDiapers.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DIAPER);
            entries.add(GOLDFISH);
        });
    }
}
