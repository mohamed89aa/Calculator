package com.example.magdy.calculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.function.Function;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil. setContentView(this,R.layout.activity_main);

    }


    private class ActivityMainBinding {
    }
}


