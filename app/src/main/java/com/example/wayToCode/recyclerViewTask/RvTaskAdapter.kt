package com.example.wayToCode.recyclerViewTask

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wayToCode.R
import com.example.wayToCode.recyclerView.ViewHolder
import kotlinx.android.synthetic.main.all_rv_layout_adapter.view.*

class RvTaskAdapter(
    val context: Context,
    val list: List<RvTaskData>,
    val onClickInterFace: OnClickInterFace
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.all_rv_layout_adapter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.txtName.text = (list[position].name)
        Glide.with(context).load(list[position].image).centerCrop().into(holder.itemView.img)
        holder.itemView.img.setOnClickListener {
            onClickInterFace.onClickItem()
        }

    }

    override fun getItemCount(): Int = list.size
}
