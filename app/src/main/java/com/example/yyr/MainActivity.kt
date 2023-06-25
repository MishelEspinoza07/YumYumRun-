package com.example.yyr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yyr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

         setTheme(R.style.Base_Theme_YYR)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calificanos)
    }
}