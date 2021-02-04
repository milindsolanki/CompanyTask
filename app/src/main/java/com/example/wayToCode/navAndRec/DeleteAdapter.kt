package com.example.wayToCode.navAndRec

import android.content.Context
import android.net.wifi.ScanResult
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wayToCode.R
import com.example.wayToCode.recyclerView.UserData
import com.example.wayToCode.recyclerView.ViewHolder
import kotlinx.android.synthetic.main.user_list_adapter.view.*

class DeleteAdapter(
    val context: Context?,
    val list: ArrayList<UserData>,
    val deleteItem: DeleteItem
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.user_list_adapter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.txtName.text = list[position].userName
        holder.itemView.txtEmail.text = list[position].userEmail
        holder.itemView.txtNumber.text = list[position].number.toString()
        Glide.with(context!!).load(list[position].image).centerCrop().into(holder.itemView.img)

        var currentPosition = position
        val infoData = list[position]
        holder.itemView.cvClick.setOnClickListener {
            // deleteItem.onItemDelete()
            Toast.makeText(context, "Delete Item single Click", Toast.LENGTH_SHORT).show()
            removeItem(infoData, currentPosition)

        }
        holder.itemView.cvClick.setOnLongClickListener {
            Toast.makeText(context, "Delete Item Long Click", Toast.LENGTH_SHORT).show()
            removeItem(infoData, currentPosition)
            return@setOnLongClickListener true
        }

    }

    public fun removeItem(infoData: UserData, currentPosition: Int) {
        val currentPosition = list.indexOf(infoData)
        list.removeAt(currentPosition)
        notifyItemRemoved(currentPosition)
    }


    override fun getItemCount(): Int = list.size

}