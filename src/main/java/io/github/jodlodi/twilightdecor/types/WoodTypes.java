package io.github.jodlodi.twilightdecor.types;

import lilypuree.decorative_blocks.blocks.types.IWoodType;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class WoodTypes
{
    public static Set<Pair<String, IWoodType>> woodTypes = new HashSet<>();

    static {
        addModWoodTypes(WoodEnum.values());
    }

    private static void addModWoodTypes(IWoodType[] modWood) {
        Arrays.stream(modWood).forEach(woodType -> woodTypes.add(Pair.of("twilightforest", woodType)));
    }

    public static Collection<IWoodType> allWoodTypes() {
        return woodTypes.stream().map(Pair::getValue).collect(Collectors.toList());
    }
}
