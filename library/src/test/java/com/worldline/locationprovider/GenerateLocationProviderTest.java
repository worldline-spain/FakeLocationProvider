package com.worldline.locationprovider;

import android.location.Location;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by a557114 on 22/09/2015.
 */
public class GenerateLocationProviderTest {

    private static final double MAX_LAT = 90;
    private static final double MIN_LAT = -90;

    private static final double MAX_LON = 180;
    private static final double MIN_LON = -180;

    private GenerateLocationProvider gl;

    @Before
    public void init() {
        gl = GenerateLocationProvider.getInstance();
    }

    @Test
    public void shouldGenerateLocationProviderNotNull() {
        assertNotNull(gl);
    }

    @Test
    public void shouldTestLocationNotNull() {
        Location location = gl.createLocation();
        assertNotNull(location);
    }

    @Test
    public void shouldTestLocationIsValid() {
        Location location = gl.createLocation();

        double latitude = location.getLatitude();
        assertTrue("Location latitude (" + latitude + ") should be greater or equals than " + MIN_LAT, latitude >= MIN_LAT);
        assertTrue("Location latitude (" + latitude + ") should be lower or equals  than " + MAX_LAT, latitude <= MAX_LAT);

        double longitude = location.getLongitude();
        assertTrue("Location longitude (" + longitude + ") should be greater or equals  than " + MIN_LON, longitude >= MIN_LON);
        assertTrue("Location longitude (" + longitude + ") should be lower or equals  than " + MAX_LON, longitude <= MAX_LON);
    }
}
