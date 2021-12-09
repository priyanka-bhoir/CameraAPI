package com.priyanka.cameraapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.priyanka.cameraapi.BasicCamera.MainActivity;
import com.priyanka.cameraapi.Camerax.CameraxInKotlin;

public class CameraxMain extends AppCompatActivity {

    Button camera;
    Button camerax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camerax2);

        camera = findViewById(R.id.camera);
        camerax = findViewById(R.id.camraX);

        camera.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
        });

        camerax.setOnClickListener(view -> {
            startActivity(new Intent(this, CameraxInKotlin.class));
        });

    }
}