package com.example.tourguide;

public class Block {

    private final String mHotelName;
    private final String mHotelRating;
    private int mHotelImageId;
    private final String mHotelRank;
    private float mlatitude;
    private float mlongitude;

    //constructor
    public Block(String hotelRank, int hotelImage, String hotelName, String hotelRating, float latitude, float longitude){
        mHotelRank = hotelRank;
        mHotelImageId = hotelImage;
        mHotelName = hotelName;
        mHotelRating = hotelRating;
        mlatitude = latitude;
        mlongitude = longitude;
    }

    //methods to be revoked from outside
    public String getmHotelRank() {
        return mHotelRank;
    }

    public int getmHotelImageId() {
        return mHotelImageId;
    }

    public String getmHotelName(){
        return mHotelName;
    }

    public String getmHotelRating(){
        return mHotelRating;
    }

    public float getMlatitude() {
        return mlatitude;
    }

    public float getMlongitude() {
        return mlongitude;
    }
}
