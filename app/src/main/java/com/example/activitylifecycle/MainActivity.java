package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate invoked");
        Toast.makeText(this, "onCreate invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LifeCycle", "onStart invoked");
        Toast.makeText(this, "onStart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LifeCycle", "onResume invoked");
        Toast.makeText(this, "onResume invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Lifecycle", "onPause invoked");
        Toast.makeText(this, "onPause invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LifeCycle", "onStop invoked");
        Toast.makeText(this, "onSt0op invoked", Toast.LENGTH_SHORT).show();
    0}

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LifeCycle", "onRestart invoked");
        Toast.makeText(this, "onRestart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy invoked");
        Toast.makeText(this, "onDestroy invoked", Toast.LENGTH_SHORT).show();
    }
}
