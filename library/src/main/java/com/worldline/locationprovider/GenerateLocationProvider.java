package com.worldline.locationprovider;

import android.location.Location;

/**
 * Created by a557114 on 22/09/2015.
 */
public class GenerateLocationProvider {

    private static GenerateLocationProvider INSTANCE;

    public static GenerateLocationProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GenerateLocationProvider();
        }
        return INSTANCE;
    }

    private GenerateLocationProvider() {

    }

    public Location createLocation() {
        Location location = new Location("");

        location.setLatitude(GenerateLocationValuesProvider.getInstance().generateLatitude());
        location.setLongitude(GenerateLocationValuesProvider.getInstance().generateLongitude());

        return location;
    }
}
