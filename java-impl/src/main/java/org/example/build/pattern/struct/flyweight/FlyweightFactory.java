package org.example.build.pattern.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, FlyWeight> flyWeightMap = new HashMap<>();

    public static FlyWeight getFlyweight(String innerState) {
        if (flyWeightMap.containsKey(innerState)) {
            return flyWeightMap.get(innerState);
        }
        FlyWeight flyWeight = new ConcreteFlyweight(innerState);
        flyWeightMap.put(innerState, flyWeight);
        return flyWeight;
    }
}
