package com.example.yyr

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.yyr.databinding.MainItemBinding


class ItemAdapter: RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private var foodItems = mutableListOf<FoodItem>()
    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemViewHolder {
        context = parent.context
        return ItemViewHolder(
            MainItemBinding.inflate (
                LayoutInflater.from(parent.context),
                parent,

                    )
                )
    }
