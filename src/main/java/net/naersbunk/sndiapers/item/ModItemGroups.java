package net.naersbunk.sndiapers.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.naersbunk.sndiapers.SNDiapers;
import net.naersbunk.sndiapers.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SNDIAPERS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SNDiapers.MOD_ID, "sn_diapers_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DIAPER))
                    .displayName(Text.translatable("itemgroup.tutorialmod.sn_diaper_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DIAPER);
                        entries.add(ModItems.GOLDFISH);
                        entries.add(ModBlocks.PAIL);
                        entries.add(ModBlocks.USED_DIAPER_PILE);
                    }).build());

    public static void registerItemGroups() {
        SNDiapers.LOGGER.info("Registering item groups for " + SNDiapers.MOD_ID);
    }
}
