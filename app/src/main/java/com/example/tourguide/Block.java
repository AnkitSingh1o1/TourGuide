package com.example.tourguide;

public class Block {

    private final String mHotelName;
    private final String mHotelRating;
    private int mHotelImageId;

    //constructor
    public Block(int hotelImage, String hotelName, String hotelRating){
        mHotelImageId = hotelImage;
        mHotelName = hotelName;
        mHotelRating = hotelRating;
    }

    //methods to be revoked from outside
    public int getmHotelImageId() {
        return mHotelImageId;
    }

    public String getmHotelName(){
        return mHotelName;
    }

    public String getmHotelRating(){
        return mHotelRating;
    }
}
