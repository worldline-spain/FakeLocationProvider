package com.worldline.locationprovider;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by a557114 on 22/09/2015.
 */
public class GenerateLocationValuesProviderTest {

    private static final double MAX_LAT = 90;
    private static final double MIN_LAT = -90;

    private static final double MAX_LON = 180;
    private static final double MIN_LON = -180;

    private GenerateLocationValuesProvider gl;

    @Before
    public void init() {
        gl = GenerateLocationValuesProvider.getInstance();
    }

    @Test
    public void shouldGenerateLocationValuesProviderNotNull() {
        assertNotNull(gl);
    }

    @Test
    public void shouldReturnTrueForMaxLatitude() {
        assertEquals(Double.doubleToRawLongBits(MAX_LAT), Double.doubleToRawLongBits(GenerateLocationValuesProvider.MAX_LAT));
    }

    @Test
    public void shouldReturnTrueForMinLatitude() {
        assertEquals(Double.doubleToRawLongBits(MIN_LAT), Double.doubleToRawLongBits(GenerateLocationValuesProvider.MIN_LAT));
    }

    @Test
    public void shouldReturnTrueForMaxLongitude() {
        assertEquals(Double.doubleToRawLongBits(MAX_LON), Double.doubleToRawLongBits(GenerateLocationValuesProvider.MAX_LON));
    }

    @Test
    public void shouldReturnTrueForMinLongitude() {
        assertEquals(Double.doubleToRawLongBits(MIN_LON), Double.doubleToRawLongBits(GenerateLocationValuesProvider.MIN_LON));
    }

    @Test
    public void shouldReturnValidLatitude() {
        double latitude = gl.generateLatitude();
        assertTrue("Location latitude (" + latitude + ") should be greater or equals than " + MIN_LAT, latitude >= MIN_LAT);
        assertTrue("Location latitude (" + latitude + ") should be lower or equals  than " + MAX_LAT, latitude <= MAX_LAT);
    }

    @Test
    public void shouldReturnValidLongitude() {
        double longitude = gl.generateLongitude();
        assertTrue("Location longitude (" + longitude + ") should be greater or equals  than " + MIN_LON, longitude >= MIN_LON);
        assertTrue("Location longitude (" + longitude + ") should be lower or equals  than " + MAX_LON, longitude <= MAX_LON);
    }

}
