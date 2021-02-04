package com.example.wayToCode.recyclerViewTaskTwo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wayToCode.R
import com.example.wayToCode.recyclerView.ViewHolder
import kotlinx.android.synthetic.main.text_adapter.view.*

class RvTaskTwoAdapter(val context: Context, var list: ArrayList<ListName>, val selectItem: SelectItem) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.text_adapter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.txtName.text = list[position].itemName
        holder.itemView.setOnClickListener {
            selectItem.onClick(list[position].itemName)
        }
    }

    override fun getItemCount(): Int = list.size
    fun details(list1: List<ListName>){
        list=ArrayList()
        list.addAll(list1)
        notifyDataSetChanged()




    }
}