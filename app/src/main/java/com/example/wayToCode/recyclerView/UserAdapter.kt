package com.example.wayToCode.recyclerView

import android.content.Context
import android.content.Intent
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wayToCode.R
import com.example.wayToCode.recyclerViewClick.RecyclerViewIntentActivity
import kotlinx.android.synthetic.main.user_list_adapter.view.*

class UserAdapter(val context: Context, val list: List<UserData>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(), View.OnCreateContextMenuListener {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.user_list_adapter, parent, false)
        )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var image: String = ""
        holder.itemView.txtName.text = list[position].userName
        holder.itemView.txtEmail.text = list[position].userEmail
        holder.itemView.txtNumber.text = list[position].number.toString()
        Glide.with(context).load(list[position].image).centerCrop().into(holder.itemView.img)
        image = holder.itemView.img.toString()
        holder.itemView.setOnCreateContextMenuListener(this)

        holder.itemView.cvClick.setOnClickListener {
            val intent = Intent(context, RecyclerViewIntentActivity::class.java)
            intent.putExtra("NAME", holder.itemView.txtName.text.toString())
            intent.putExtra("EMAIL", holder.itemView.txtEmail.text.toString())
            intent.putExtra("NUMBER", holder.itemView.txtNumber.text.toString())
            intent.putExtra("IMAGE", image)
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int = list.size

    override fun onCreateContextMenu(
        contextMenu: ContextMenu,
        view: View,
        contextMenuInfo: ContextMenu.ContextMenuInfo?
    ) {
        contextMenu.add(0, view.id, 0, "Add")
        contextMenu.add(0, view.id, 0, "Delete")
    }


}