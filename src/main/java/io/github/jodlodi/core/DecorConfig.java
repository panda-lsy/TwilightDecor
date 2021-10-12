package io.github.jodlodi.core;

import io.github.jodlodi.TwilightDecor;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import org.apache.commons.lang3.tuple.Pair;

@EventBusSubscriber(modid = TwilightDecor.MOD_ID)
public class DecorConfig {
    public static final Common COMMON_CONFIG;
    public static final ForgeConfigSpec COMMON_SPEC;

    static {
        final Pair<Common, ForgeConfigSpec> pair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = pair.getRight();
        COMMON_CONFIG = pair.getLeft();
    }

    public static String LoopCustom;
    public static String LinearCustom;

    public static class Common {
        public final ConfigValue<String> loopTransString;
        public final ConfigValue<String> linearTransString;

        Common(ForgeConfigSpec.Builder builder) {
            builder.
                    comment("Here you have the option to change which pairs of mobs are transformed by transformation powder." +
                            "\nThe format is \"modID:mobName-modID:mobName\", the same way as you would type it in game if you were to use something like the /summon command, you also have to type a dash in the middle that links mobs." +
                            "\nYou can link as many mobs as you like, let's say you wrote in \"minecraft:pig-minecraft:cow-minecraft:chicken\". A pig will transform into a cow, a cow into a chicken and a chicken back into a pig." +
                            "\nYou will notice that there are two input slots for mobs, the loop input works as described above, the linear input however, would if provided with the example from above, make it so that the last mob in the link will not be able to transform back into the first mob in the link." +
                            "\nThere are no linear transformations in the \"vanilla\" Twilight Forest mod, so the input is left empty, the loop input is setup to work as the original developers intended. If you want to undo any changes made to the config, delete this file.").
                    push("TRANSFORMATIONS");
            loopTransString = builder.define("Transformations that loop", "twilightforest:minotaur-minecraft:zombified_piglin twilightforest:deer-minecraft:cow twilightforest:bighorn_sheep-minecraft:sheep twilightforest:wild_boar-minecraft:pig twilightforest:bunny-minecraft:rabbit twilightforest:tiny_bird-minecraft:parrot twilightforest:raven-minecraft:bat twilightforest:hostile_wolf-minecraft:wolf twilightforest:penguin-minecraft:chicken twilightforest:hedge_spider-minecraft:spider twilightforest:swarm_spider-minecraft:cave_spider twilightforest:wraith-minecraft:blaze twilightforest:redcap-minecraft:villager twilightforest:skeleton_druid-minecraft:witch");
            linearTransString = builder.define("Transformations that are linear", "");
            builder.pop();
        }
    }

    public static void refresh() {
        LoopCustom = COMMON_CONFIG.loopTransString.get();
        LinearCustom = COMMON_CONFIG.linearTransString.get();
    }
}