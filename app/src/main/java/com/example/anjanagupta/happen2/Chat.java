package com.example.anjanagupta.happen2;

/**
 * Created by anjanagupta on 3/7/16.
 */
public class Chat {

    private String message;
    private String author;
   // private String lat;
   // private String lon;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private Chat() {
    }

   // Chat(String message, String author, String lat, String lon) {
     Chat(String message, String author) {
        this.message = message;
        this.author = author;
        //this.lat = lat;
        //this.lon = lon;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

   // public String getLat() { return lat; }

    //public String getLon() { return lon; }
}
