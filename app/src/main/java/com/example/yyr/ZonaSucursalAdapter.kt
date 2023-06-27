package com.example.yyr

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ZonaSucursalAdapter (val zonasLista: List<Zonas>,
private val onClickListener: (Int)-> Unit):
        RecyclerView.Adapter<ZonaSurcusalHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZonaSurcusalHolder {
//        binding = ActivityDireccionPagoBinding.inflate(layoutInflater)
                val layoutInflater = LayoutInflater.from(parent.context)
                return ZonaSurcusalHolder(layoutInflater.inflate(R.layout.activity_zona_sucursal,parent,false))
        }

        override fun onBindViewHolder(holder: ZonaSurcusalHolder, position: Int) {
                holder.render(zonasLista[position], onClickListener)
        }

        override fun getItemCount(): Int {
                return zonasLista.size
        }
}

