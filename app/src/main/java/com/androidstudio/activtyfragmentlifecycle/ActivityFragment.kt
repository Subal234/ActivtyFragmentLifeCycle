package com.androidstudio.activtyfragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
    }
}