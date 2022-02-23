package com.example.tourguide;

public class Block {

    private final String mHotelName;
    private String mHotelRating = "";
    private int mHotelImageId ;
    private String mHotelRank = NOT_SET;
    private float mlatitude;
    private float mlongitude;

    //For arrayAdapter
    public static final String NOT_SET = "-1";

    //Shopping Constructor
    public Block(int marketImageId, String marketName, float marketLat, float marketLon){
        mHotelImageId= marketImageId;
        mHotelName = marketName;
        mlatitude = marketLat;
        mlongitude = marketLon;
    }


    //Accomadation constructor
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

    public float getMlatitude() { return mlatitude; }

    public float getMlongitude() { return mlongitude; }



    //Function for BlockAdapter
    public boolean hasMHotelRank(){
        return mHotelRank != NOT_SET;
    }

}
