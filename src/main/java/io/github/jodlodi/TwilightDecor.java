package io.github.jodlodi;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import io.github.jodlodi.core.DecorReg;
import io.github.jodlodi.core.setup.ClientRender;
import io.github.jodlodi.core.setup.ItemCompat;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TwilightDecor.MOD_ID)
@Mod.EventBusSubscriber(modid = TwilightDecor.MOD_ID)
public class TwilightDecor
{
    public static final String MOD_ID = "twilightdecor";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public TwilightDecor() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
        REGISTRY_HELPER.register(bus);

        MinecraftForge.EVENT_BUS.register(this);

        DecorReg.register();
    }


    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(ItemCompat::regCompat);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ClientRender.regRenderLayers();
            ClientRender.registerBlockColors();
        });
    }
}
