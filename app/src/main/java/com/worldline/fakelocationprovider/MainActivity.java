package com.worldline.fakelocationprovider;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.worldline.locationprovider.GenerateLocationProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView locationLatitude = (TextView) findViewById(R.id.locationLatitude);
        TextView locationLongitude = (TextView) findViewById(R.id.locationLongitude);

        GenerateLocationProvider instance = GenerateLocationProvider.getInstance();

        Location location = instance.createLocation();

        locationLatitude.setText(String.valueOf(location.getLatitude()));
        locationLongitude.setText(String.valueOf(location.getLongitude()));
    }

}
