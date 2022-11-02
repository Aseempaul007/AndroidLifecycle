package com.example.androidlifecyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("TAG","Oncreate Called");
        Toast.makeText(MainActivity.this,"Oncreate Called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("TAG","onStart Called");
        Toast.makeText(MainActivity.this,"onStart Called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("TAG","onResume Called");
        Toast.makeText(MainActivity.this,"onResume Called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("TAG","onPause Called");
        Toast.makeText(MainActivity.this,"onPause Called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("TAG","onStop Called");
        Toast.makeText(MainActivity.this,"onStop Called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("TAG","onDestroy Called");
        Toast.makeText(MainActivity.this,"onDestroy Called",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("TAG","onRestart Called");
        Toast.makeText(MainActivity.this,"onRestart Called",Toast.LENGTH_LONG).show();
    }
}