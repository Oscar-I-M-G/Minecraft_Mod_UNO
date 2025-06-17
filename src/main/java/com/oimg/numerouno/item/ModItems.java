package com.oimg.numerouno.item;

import com.oimg.numerouno.NumeroUno;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // These are our items and im telling you to register them
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NumeroUno.MOD_ID);

    // This is a membrillo la flor
    public static final RegistryObject<Item> MEMBRILLO = ITEMS.register("membrillo", () -> new Item(new Item.Properties()));

    // Cajetilla de membrillo
    public static final RegistryObject<Item> CAJETILLAMEMBRILLO = ITEMS.register("cajetilla_membrillo", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
     }
}
