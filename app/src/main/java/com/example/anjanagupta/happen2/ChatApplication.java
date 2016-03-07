package com.example.anjanagupta.happen2;

import com.firebase.client.Firebase;

/**
 * Created by anjanagupta on 3/7/16.
 */
public class ChatApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}