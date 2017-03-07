package com.example.android.quakereport;

/**
 * Created by ZANGETSU on 07-03-2017.
 */

public class Earthquake {

    // Magnitude of Earthquake
    private String mMagnitude;

    // Location of origin
    private String mLocation;

    // Date of occurrence
    private String mDate;

    /*
    * Create a new Earthquake Object
    *
    * @param mag is the magnitude of the earthquake
    * @param loc is the location of origin of the earthquake
    * @param date is the date of occurence of the earthquake
    * */
    public Earthquake(String mag, String loc, String date) {
        mMagnitude = mag;
        mLocation = loc;
        mDate = date;
    }

    /*
    * Get the magnitude
    * */
    public String getMagnitude() {
        return mMagnitude;
    }

    /*
    * Get the location
    * */
    public String getLocation() {
        return mLocation;
    }

    /*
    * Get the date
    * */
    public String getDate() {
        return mDate;
    }
}
