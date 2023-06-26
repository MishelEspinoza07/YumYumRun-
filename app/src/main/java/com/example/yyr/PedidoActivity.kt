package com.example.yyr

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.yyr.databinding.PedidoBinding

class PedidoActivity : AppCompatActivity() {
    private var activitichange = true
    private lateinit var binding: PedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PedidoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        object : CountDownTimer(3600, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val minute = (millisUntilFinished / 1000) / 60
                val seconds = seconds(millisUntilFinished)
                binding.textView.text = "$minute:$seconds"
            }
            override fun onFinish() {
                if(activitichange)
                    next()
            }
        }.start()
        binding.sillegaAntes.setOnClickListener{
            next()
        }
    }
    fun seconds(millisUntilFinished: Long): String {
        return if ((millisUntilFinished / 1000) % 60 < 10) {
            "0${(millisUntilFinished / 1000) % 60}"
        } else {
            "${(millisUntilFinished / 1000) % 60}"
        }
    }

    fun next(){
        val intent = Intent(this, CalificanosActivity::class.java)
        startActivity(intent)
        finish()
        activitichange = false
    }
}