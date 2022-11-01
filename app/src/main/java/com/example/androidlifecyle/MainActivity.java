package com.example.androidlifecyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("TAG","Oncreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("TAG","onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("TAG","onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("TAG","onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("TAG","onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("TAG","onDestroy Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("TAG","onRestart Called");
    }
}