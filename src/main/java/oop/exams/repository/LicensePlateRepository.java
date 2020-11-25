package oop.exams.repository;

import oop.exams.exception.BadRegionException;
import oop.exams.model.Region;

import java.util.*;

public class LicensePlateRepository {

    private static final Map<String, Region> regionByState = new HashMap<>();
    private static final EnumMap<Region, Set<String>> licensePlatesByRegion = new EnumMap<>(Region.class);

    static {
        regionByState.put("SON", Region.NORTH);
        regionByState.put("VER", Region.EAST);
        regionByState.put("SIN", Region.WEST);
        regionByState.put("SLP", Region.CENTER);
        regionByState.put("MIC", Region.SOUTH);
    }

    public Region getRegionByState(String state) {
        if (!regionByState.containsKey(state)) {
            throw new BadRegionException("Estado desconocido");
        }
        return regionByState.get(state);
    }

    public int countByRegion(Region region) {
        return licensePlatesByRegion.get(region).size();
    }

    public void save(Region region, String licensePlate) {
        if (!licensePlatesByRegion.containsKey(region)) {
            licensePlatesByRegion.put(region, new LinkedHashSet<>());
        }

        licensePlatesByRegion.get(region).add(licensePlate);
    }
}
