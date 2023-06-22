package com.example.yyr
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yyr.databinding.ActivityDireccionPagoBinding

class direccion_pago : AppCompatActivity() {

    private lateinit var binding: direccionPagoBinding

    companion object {
        val MontoTotal: String ="0"
    }

    var zonasDisponibles: List<Zonas> = listOf(
        Zonas(0, "San Pedro"),
        Zonas (1, "Tembladerani"),
        Zonas (2, "San Antonio"),
        Zonas (3, "Miraflores" ),
        Zonas (4, "Obrajes"),
        Zonas (5, "<Ipavi"),
        Zonas (6, "irpavi 2"),

    )

    private lateinit var variableTotal: String

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDireccionPagoBinding.inflate(youtInflater)
        val view= binding.root
        setContentView(view)

        binding.totalDar.text = intent.getStringExtra(MontoTotal).orEmpty()



        setContentView(R.layout.activity_direccion_pago)
    }
}