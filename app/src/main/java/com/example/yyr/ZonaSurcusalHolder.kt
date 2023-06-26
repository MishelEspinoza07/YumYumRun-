package com.example.yyr

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.ZonaSucursalBinding

class ZonaSurcusalHolder (view: View): RecyclerView.ViewHolder(view) {

    private var binding = ZonaSucursalBinding.bind(view)

    @SuppressLint("SetTextI18n")
    fun render(zonasDisponibles: Zonas, onClickListener:(Int) -> Unit){
        binding.selectingZone.text = zonasDisponibles.nombreZona
        binding.selectingZone.setOnClickListener{onClickListener(zonasDisponibles.identificacion)}
    }

}

