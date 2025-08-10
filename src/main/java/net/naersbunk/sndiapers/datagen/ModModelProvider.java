package net.naersbunk.sndiapers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.naersbunk.sndiapers.block.ModBlocks;
import net.naersbunk.sndiapers.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.USED_DIAPER_PILE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PAIL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DIAPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDFISH, Models.GENERATED);
    }
}
