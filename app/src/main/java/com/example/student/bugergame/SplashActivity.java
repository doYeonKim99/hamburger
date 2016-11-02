package com.example.student.bugergame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Student on 2016-11-02.
 */

public class SplashActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
