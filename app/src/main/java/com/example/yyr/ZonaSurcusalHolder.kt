package com.example.yyr

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.yyr.databinding.ActivityZonaSucursalBinding


class ZonaSurcusalHolder (view: View): RecyclerView.ViewHolder(view) {

    private var binding = ActivityZonaSucursalBinding.bind(view)

    @SuppressLint("SetTextI18n")
    fun render(zonasDisponibles: Zonas, onClickListener:(Int) -> Unit){
        binding.selectingZone.text = zonasDisponibles.nombreZona
        binding.selectingZone.setOnClickListener{onClickListener(zonasDisponibles.identificaion)}
    }

}

