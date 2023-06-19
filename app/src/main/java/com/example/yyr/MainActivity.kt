package com.example.yyr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
//import com.example.yyr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {

    lateinit var signing: Button
    private val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

         setTheme(R.style.Base_Theme_YYR)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    fun initViews(){
        signing = findViewById(R.id.bt_iniciar_sesion)
        signing.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Log.d(TAG, "siguiente pantalla")
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
        setContentView(R.layout.signup)
    }
}