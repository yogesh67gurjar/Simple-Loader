package com.yogesh.simpleloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import com.yogesh.loader.showLoader

import com.yogesh.simpleloader.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.showLoader.setOnClickListener {
            showLoader(activityMainBinding.rootLayout, this)
        }
    }
}