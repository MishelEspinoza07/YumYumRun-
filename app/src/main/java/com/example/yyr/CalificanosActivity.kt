package com.example.yyr
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.yyr.databinding.CalificanosBinding
import kotlin.system.exitProcess

class CalificanosActivity : AppCompatActivity(){
    private lateinit var binding : CalificanosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CalificanosBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.textIdCali.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Muchas Gracias por calificarnos!!", Toast.LENGTH_SHORT
            ).show()
        }

        binding.yesButton.setOnClickListener {
            val intentRedirect = Intent(this, MainActivity::class.java)
            startActivity(intentRedirect)
            finish()
        }

        binding.noButtom.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Muchas gracias por usar YumYumRun!",
                Toast.LENGTH_LONG
            ).show()
            finishAffinity()
            exitProcess(0)
        }
    }
}