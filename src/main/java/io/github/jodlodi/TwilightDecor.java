package io.github.jodlodi;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import io.github.jodlodi.core.DecorConfig;
import io.github.jodlodi.core.DecorReg;
import io.github.jodlodi.core.setup.ClientRender;
import io.github.jodlodi.core.setup.ConfigSetup;
import io.github.jodlodi.core.setup.ItemCompat;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TwilightDecor.MOD_ID)
@Mod.EventBusSubscriber(modid = TwilightDecor.MOD_ID)
public class TwilightDecor
{
    public static final String MOD_ID = "twilightdecor";
    public static TwilightDecor instance;
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public static final Logger LOGGER = LogManager.getLogger();

    public TwilightDecor() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        bus.addListener(this::configSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
        REGISTRY_HELPER.register(bus);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DecorConfig.COMMON_SPEC);

        DecorReg.register();
    }

    private void configSetup(ModConfig.ModConfigEvent event) {
        DecorConfig.refresh();
        String[] input = {DecorConfig.LoopCustom, DecorConfig.LinearCustom};
        ConfigSetup.addCustomInitTransformations(input);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ItemCompat.regCompat();
        });
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ClientRender.regRenderLayers();
            ClientRender.registerBlockColors();
        });
    }
}
