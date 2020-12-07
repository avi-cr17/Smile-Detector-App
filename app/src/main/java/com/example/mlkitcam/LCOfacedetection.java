package com.example.mlkitcam;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class LCOfacedetection extends Application {

    public static final String result_text = "RESULT_TEXT";
    public static final String result_dialog = "RESULT_DIALOG";


    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
