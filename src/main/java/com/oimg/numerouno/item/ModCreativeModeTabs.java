package com.oimg.numerouno.item;

import com.oimg.numerouno.NumeroUno;
import com.oimg.numerouno.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NumeroUno.MOD_ID);

    public  static final RegistryObject<CreativeModeTab> MEMBRILLO_ITEMS_TAB = CREATIVE_MODE_TABS.register("membrillo_items_tab", () -> CreativeModeTab.builder
            ()
            .icon(() -> new ItemStack(ModItems.MEMBRILLO.get())) //This is for the tab icon
            .title(Component.translatable("creativetab.numerouno.membrillo_items")) // this is the name of the tab
            .displayItems((itemDisPar, out) -> {
                out.accept(ModItems.MEMBRILLO.get());
                out.accept(ModItems.CAJETILLAMEMBRILLO.get());
                out.accept(ModBlocks.CAJETILLA_MEMBRILLO_BLOCK.get());
            })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
