package cn.foggyhillside.ends_delight.registry;

import cn.foggyhillside.ends_delight.EndsDelight;
import cn.foggyhillside.ends_delight.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EndsDelight.MODID);
    //BlockItem
    public static final RegistryObject<Item> ChorusFruitCrate = ITEMS.register("chorus_fruit_crate",
            () -> new BlockItem(BlockRegistry.ChorusFruitCrate.get(), new Item.Properties()));
    public static final RegistryObject<Item> EndStove = ITEMS.register("end_stove",
            () -> new BlockItem(BlockRegistry.EndStove.get(), new Item.Properties()));
    //knife
    public static final RegistryObject<Item> DragonEggShellKnife = ITEMS.register("dragon_egg_shell_knife",
            () -> new KnifeItem(MaterialRegistry.DRAGON_EGG_SHELL, 0.5F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> PurpurKnife = ITEMS.register("purpur_knife",
            () -> new KnifeItem(MaterialRegistry.PURPUR, 0.5F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> EndStoneKnife = ITEMS.register("end_stone_knife",
            () -> new KnifeItem(MaterialRegistry.END_STONE, 0.5F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> DragonToothKnife = ITEMS.register("dragon_tooth_knife",
            () -> new DragonToothKnifeItem(MaterialRegistry.DRAGON_TOOTH, 0.5F, -2.0F, new Item.Properties()));
    //Ingredients And Other Foods
    public static final RegistryObject<Item> EnderPearlGrain = ITEMS.register("ender_pearl_grain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ChorusFruitGrain = ITEMS.register("chorus_fruit_grain",
            () -> new Item(new Item.Properties().food(FoodList.ChorusFruitGrain)));
    public static final RegistryObject<Item> ChorusSucculent = ITEMS.register("chorus_succulent",
            () -> new BlockItem(BlockRegistry.ChorusSucculent.get(), new Item.Properties().food(FoodList.ChorusSucculent)));
    public static final RegistryObject<Item> DriedChorusFlower = ITEMS.register("dried_chorus_flower",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DragonTooth = ITEMS.register("dragon_tooth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NonHatchableDragonEgg = ITEMS.register("non_hatchable_dragon_egg",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> HalfDragonEggShell = ITEMS.register("half_dragon_egg_shell",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> LiquidDragonEgg = ITEMS.register("liquid_dragon_egg",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.LiquidDragonEgg), true));
    public static final RegistryObject<Item> FriedDragonEgg = ITEMS.register("fried_dragon_egg",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.FriedDragonEgg), true));
    public static final RegistryObject<Item> ShulkerMeat = ITEMS.register("shulker_meat",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.ShulkerMeat), true));
    public static final RegistryObject<Item> ShulkerMeatSlice = ITEMS.register("shulker_meat_slice",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.ShulkerMeatSlice), true));
    public static final RegistryObject<Item> RoastedShulkerMeat = ITEMS.register("roasted_shulker_meat",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.RoastedShulkerMeat), true));
    public static final RegistryObject<Item> RoastedShulkerMeatSlice = ITEMS.register("roasted_shulker_meat_slice",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.RoastedShulkerMeatSlice), true));
    public static final RegistryObject<Item> DragonLeg = ITEMS.register("dragon_leg",
            () -> new Item(new Item.Properties().food(FoodList.DragonLeg)));
    public static final RegistryObject<Item> SmokedDragonLeg = ITEMS.register("smoked_dragon_leg",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.SmokedDragonLeg), true));
    public static final RegistryObject<Item> RawDragonMeat = ITEMS.register("raw_dragon_meat",
            () -> new Item(new Item.Properties().food(FoodList.RawDragonMeat)));
    public static final RegistryObject<Item> RoastedDragonMeat = ITEMS.register("roasted_dragon_meat",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.RoastedDragonMeat), true));
    public static final RegistryObject<Item> RawDragonMeatCuts = ITEMS.register("raw_dragon_meat_cuts",
            () -> new Item(new Item.Properties().food(FoodList.RawDragonMeatCuts)));
    public static final RegistryObject<Item> RoastedDragonMeatCuts = ITEMS.register("roasted_dragon_meat_cuts",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.RoastedDragonMeatCuts), true));
    public static final RegistryObject<Item> RawEndermiteMeat = ITEMS.register("raw_ender_mite_meat",
            () -> new Item(new Item.Properties().food(FoodList.RawEndermiteMeat)));
    public static final RegistryObject<Item> DriedEndermiteMeat = ITEMS.register("dried_endermite_meat",
            () -> new Item(new Item.Properties().food(FoodList.DriedEndermiteMeat)));
    public static final RegistryObject<Item> EndermanGristle = ITEMS.register("enderman_gristle",
            () -> new EndermanGristleItem(new Item.Properties().food(FoodList.EndermanGristle), 0.3F, false));
    public static final RegistryObject<Item> ChorusSauce = ITEMS.register("chorus_sauce",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.ChorusSauce).craftRemainder(Items.BOWL).stacksTo(64)));
    public static final RegistryObject<Item> ShulkerOmeletteMixture = ITEMS.register("shulker_omelette_mixture",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.ShulkerOmeletteMixture).stacksTo(64),true));
    public static final RegistryObject<Item> ShulkerOmelette = ITEMS.register("shulker_omelette",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.ShulkerOmelette),true));
    public static final RegistryObject<Item> RawEnderSausage = ITEMS.register("raw_ender_sausage",
            () -> new EndermanGristleItem(new Item.Properties().food(FoodList.RawEnderSausage), 0.3F, false));
    public static final RegistryObject<Item> EnderSausage = ITEMS.register("ender_sausage",
            () -> new EndermanGristleStewItem(new Item.Properties().food(FoodList.EnderSausage), 0.2F, true, true));
    public static final RegistryObject<Item> EnderBambooRice = ITEMS.register("ender_bamboo_rice",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.EnderBambooRice), true));
    public static final RegistryObject<Item> StuffedRiceCake = ITEMS.register("stuffed_rice_cake",
            () -> new ChorusFruitPieSliceItem(new Item.Properties().food(FoodList.StuffedRiceCake)));
    public static final RegistryObject<Item> ChorusFlowerPie = ITEMS.register("chorus_flower_pie",
            () -> new ChorusFruitPieSliceItem(new Item.Properties().food(FoodList.ChorusFlowerPie), true));
    public static final RegistryObject<Item> ChorusCookie = ITEMS.register("chorus_cookie",
            () -> new ChorusFruitPieSliceItem(new Item.Properties().food(FoodList.ChorusCookie)));
    public static final RegistryObject<Item> ChorusFruitPopsicle = ITEMS.register("chorus_fruit_popsicle",
            () -> new ChorusFruitPopsicleItem(new Item.Properties().food(FoodList.ChorusFruitPopsicle).stacksTo(16)));
    //Drink
    public static final RegistryObject<Item> ChorusFruitWine = ITEMS.register("chorus_fruit_wine",
            () -> new ChorusFruitWineItem(new Item.Properties().food(FoodList.ChorusFruitWine).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> ChorusFruitMilkTea = ITEMS.register("chorus_fruit_milk_tea",
            () -> new BubbleTeaItem(new Item.Properties().food(FoodList.ChorusFruitMilkTea).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> BubbleTea = ITEMS.register("bubble_tea",
            () -> new BubbleTeaItem(new Item.Properties().food(FoodList.BubbleTea).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> DragonBreathSoda = ITEMS.register("dragon_breath_soda",
            () -> new DrinkableItem(new Item.Properties().food(FoodList.DragonBreathSoda).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE), true));
    public static final RegistryObject<Item> ChorusFlowerTea = ITEMS.register("chorus_flower_tea",
            () -> new ChorusFlowerTeaItem(new Item.Properties().food(FoodList.ChorusFlowerTea).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE), true, true));
    //Pie
    public static final RegistryObject<Item> ChorusFruitPie = ITEMS.register("chorus_fruit_pie",
            () -> new BlockItem(BlockRegistry.ChorusFruitPie.get(), new Item.Properties()));
    public static final RegistryObject<Item> ChorusFruitPieSlice = ITEMS.register("chorus_fruit_pie_slice",
            () -> new ChorusFruitPieSliceItem(new Item.Properties().food(FoodValues.PIE_SLICE), true));
    //Congee
    public static final RegistryObject<Item> EnderCongee = ITEMS.register("ender_congee",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.EnderCongee).craftRemainder(Items.BOWL).stacksTo(16), true));
    //Soup
    public static final RegistryObject<Item> DragonBreathAndChorusSoup = ITEMS.register("dragon_breath_and_chorus_soup",
            () -> new DragonBreathAndChorusSoupItem(new Item.Properties().food(FoodList.DragonBreathAndChorusSoup).craftRemainder(Items.BOWL).stacksTo(16), true, true));
    public static final RegistryObject<Item> ShulkerSoup = ITEMS.register("shulker_soup",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.ShulkerSoup).craftRemainder(Items.BOWL).stacksTo(16), true));
    //ConsumableItem
    public static final RegistryObject<Item> EnderNoodle = ITEMS.register("ender_noodle",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.EnderNoodle).craftRemainder(Items.BOWL).stacksTo(16), true));
    public static final RegistryObject<Item> EndermanGristleStew = ITEMS.register("enderman_gristle_stew",
            () -> new EndermanGristleStewItem(new Item.Properties().food(FoodList.EndermanGristleStew).craftRemainder(Items.BOWL).stacksTo(16), 0.2F, true, true));
    public static final RegistryObject<Item> StirFriedShulkerMeat = ITEMS.register("stir_fried_shulker_meat",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.StirFriedShulkerMeat).stacksTo(16).craftRemainder(Items.BOWL), true));
    public static final RegistryObject<Item> RoastedDragonSteak = ITEMS.register("roasted_dragon_steak",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.RoastedDragonSteak).stacksTo(16).craftRemainder(Items.BOWL), true));
    public static final RegistryObject<Item> EndMixedSalad = ITEMS.register("end_mixed_salad",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.EndMixedSalad).craftRemainder(Items.BOWL).stacksTo(16), true));
    public static final RegistryObject<Item> AssortedSalad = ITEMS.register("assorted_salad",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.AssortedSalad).craftRemainder(Items.SHULKER_SHELL).stacksTo(16), true));
    //BarbecueStick
    public static final RegistryObject<Item> EndBarbecueStick = ITEMS.register("end_barbecue_stick",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.EndBarbecueStick), true));
    //Feast
    public static final RegistryObject<Item> DragonLegBlock = ITEMS.register("dragon_leg_with_sauce_block",
            () -> new BlockItem(BlockRegistry.DragonLegBlock.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DragonLegWithSauce = ITEMS.register("dragon_leg_with_sauce",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.DragonLegWithSauce).stacksTo(16).craftRemainder(Items.BOWL), true));
    public static final RegistryObject<Item> SteamedDragonEggBlock = ITEMS.register("steamed_dragon_egg_block",
            () -> new BlockItem(BlockRegistry.SteamedDragonEggBlock.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SteamedDragonEgg = ITEMS.register("steamed_dragon_egg",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.SteamedDragonEgg).craftRemainder(Items.BOWL).stacksTo(16), true));
    public static final RegistryObject<Item> DragonMeatStewBlock = ITEMS.register("dragon_meat_stew_block",
            () -> new BlockItem(BlockRegistry.DragonMeatStewBlock.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DragonMeatStew = ITEMS.register("dragon_meat_stew",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.DragonMeatStew).craftRemainder(Items.BOWL).stacksTo(16), true));
    public static final RegistryObject<Item> GrilledShulkerBlock = ITEMS.register("grilled_shulker_block",
            () -> new BlockItem(BlockRegistry.GrilledShulkerBlock.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GrilledShulker = ITEMS.register("grilled_shulker",
            () -> new ConsumableItem(new Item.Properties().food(FoodList.GrilledShulker).craftRemainder(Items.BOWL).stacksTo(16), true));
}
