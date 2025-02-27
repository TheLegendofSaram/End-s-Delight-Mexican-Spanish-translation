package cn.foggyhillside.ends_delight.registry;

import cn.foggyhillside.ends_delight.EndsDelight;
import cn.foggyhillside.ends_delight.events.loot.*;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, EndsDelight.MODID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> DragonLegModifierSerializers = LOOT_MODIFIERS.register("dragon_leg", DragonLegAdditionModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> DragonMeatModifierSerializers = LOOT_MODIFIERS.register("dragon_meat", DragonMeatAdditionModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ShulkerMeatModifierSerializers = LOOT_MODIFIERS.register("shulker_meat", ShulkerMeatAdditionModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> DragonToothModifierSerializers = LOOT_MODIFIERS.register("dragon_tooth", DragonToothAdditionModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EndermiteMeatModifierSerializers = LOOT_MODIFIERS.register("endermite_meat", EndermiteMeatAdditionModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EndermanGristleModifierSerializers = LOOT_MODIFIERS.register("enderman_gristle", EndermanGristleAdditionModifier.CODEC);

    public static void register(IEventBus bus) {
        LOOT_MODIFIERS.register(bus);
    }
}
