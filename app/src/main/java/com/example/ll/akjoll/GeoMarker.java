package com.example.ll.akjoll;

/**
 * Created by LL on 18.10.2017.
 */

public class GeoMarker {

    private Double latitude;
    private Double longtitude;

    GeoMarker() {
    }

    public GeoMarker(double latitude, double longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude() {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude() {
        this.longtitude = longtitude;
    }


}
