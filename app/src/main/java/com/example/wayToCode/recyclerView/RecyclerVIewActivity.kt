package com.example.wayToCode.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_recycler_v_iew.*

class RecyclerVIewActivity : AppCompatActivity() {
    val userList = ArrayList<UserData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_v_iew)
        intiView()
    }

    private fun intiView() {
        addData()
        userRecyclerView.layoutManager = LinearLayoutManager(this)
        userRecyclerView.adapter = UserAdapter(this, userList)

    }

    private fun addData() {
        userList.clear()
        userList.add(UserData("Vishal", "mm@mm.mm", 123456, R.drawable.nachos))
        userList.add(UserData("Vishal", "mm@mm.mm", 123456, R.drawable.nachos))
        userList.add(UserData("Vishal", "mm@mm.mm", 123456, R.drawable.nachos))
        userList.add(UserData("Vishal", "mm@mm.mm", 123456, R.drawable.nachos))
        userList.add(UserData("Vishal", "mm@mm.mm", 123456, R.drawable.nachos))

    }
}