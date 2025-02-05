package me.udnek.toughasnailsu.attribute;

import me.udnek.itemscoreu.customattribute.ConstructableReversedCustomAttribute;
import me.udnek.itemscoreu.customattribute.CustomAttribute;
import me.udnek.itemscoreu.customregistry.CustomRegistries;
import me.udnek.toughasnailsu.ToughAsNailsU;

public class Attributes {

    public static final CustomAttribute COLD_RESISTANCE = register(
            new ConstructableReversedCustomAttribute("cold_resistance", 0,0, 1));
    public static final CustomAttribute HEAT_RESISTANCE = register(
            new ConstructableReversedCustomAttribute("heat_resistance", 0,0, 1));
    public static final CustomAttribute WATER_RESISTANCE = register(
            new ConstructableReversedCustomAttribute("water_resistance", 0,0, 1));


    public static CustomAttribute register(CustomAttribute attribute){
        return CustomRegistries.ATTRIBUTE.register(ToughAsNailsU.getInstance(), attribute);
    }
}
