package net.naersbunk.sndiapers.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GOLDFISH = new FoodComponent.Builder()
            .snack().nutrition(2).saturationModifier(0.1F).build();

}
