package com.example.manifestpermission

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cameraCheckPermissions.setOnClickListener {
            checkCameraPermission(Manifest.permission.CAMERA, 12)
            checkCameraPermission(Manifest.permission.READ_SMS, 122)
        }
    }
    private fun checkCameraPermission(permission: String, requestCode:Int){
        if(ContextCompat.checkSelfPermission(this, permission)
            != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this,
                arrayOf(permission), requestCode)

        } else {
            startActivity(Intent(this, successful_permission::class.java))
        }
    }
}