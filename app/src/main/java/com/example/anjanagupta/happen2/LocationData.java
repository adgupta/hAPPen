package com.example.anjanagupta.happen2;

/**
 * Created by anjanagupta on 3/9/16.
 */
import android.location.Location;

public class LocationData {

    private static LocationData instance = null;

    private LocationData(){}

    private Location location;

    public Location getLocation(){
        return location;
    }

    public void setLocation(Location _location){
        location = _location;
    }

    public static LocationData getLocationData(){
        if(instance == null){
            instance = new LocationData();
        }
        return instance;
    }
}