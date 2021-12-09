//
package com.priyanka.cameraapi.Camerax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;

import com.google.common.util.concurrent.ListenableFuture;
import com.priyanka.cameraapi.R;

public class CameraxinJava extends AppCompatActivity {

    private String  TAG = "CameraXBasic";
    private String  FILENAME_FORMAT = "yyyy-MM-dd-HH-mm-ss-SSS";
    private int  REQUEST_CODE_PERMISSIONS = 10;
//    private int REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cameraxin_java);


        if (allPermissionsGranted()) {
            startCamera();
        }
//        else {
//            ActivityCompat.requestPermissions(
//                    this, REQUIRED_PERMISSIONS, REQUEST_CODE_PERMISSIONS
//            )
        }

    private void startCamera() {

        ListenableFuture<ProcessCameraProvider> cameraProvider = ProcessCameraProvider.getInstance(this);


    }

}

    private boolean allPermissionsGranted() {

    }
}