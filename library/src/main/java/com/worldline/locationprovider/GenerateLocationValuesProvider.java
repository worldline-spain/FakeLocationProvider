package com.worldline.locationprovider;

import java.util.Random;

/**
 * Created by a557114 on 22/09/2015.
 * @see <a href="http://stackoverflow.com/a/9723834/1798470">http://stackoverflow.com/a/9723834/1798470</a>
 */
public class GenerateLocationValuesProvider {

    public static final int MIN_LAT = -90;
    public static final int MAX_LAT = 90;

    public static final int MIN_LON = -180;
    public static final int MAX_LON = 180;

    private static GenerateLocationValuesProvider INSTANCE;

    public static GenerateLocationValuesProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GenerateLocationValuesProvider();
        }
        return INSTANCE;
    }

    protected GenerateLocationValuesProvider() {

    }

    public double generateLatitude() {
        Random r = new Random();
        return (r.nextDouble() * (MAX_LAT - MIN_LAT)) + MIN_LAT;
    }

    public double generateLongitude() {
        Random r = new Random();
        return (r.nextDouble() * (MAX_LON - MIN_LON)) + MIN_LON;
    }

}
