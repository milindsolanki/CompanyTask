package com.example.wayToCode.recyclerViewClick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wayToCode.R
import com.example.wayToCode.recyclerView.UserAdapter
import com.example.wayToCode.recyclerView.UserData
import kotlinx.android.synthetic.main.activity_recycler_view_click.*

class RecyclerViewClickActivity : AppCompatActivity() {
    val userList = ArrayList<UserData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_click)
        intiView()
    }

    private fun intiView() {
        addDate()
        userClickRV.layoutManager = LinearLayoutManager(this)
        userClickRV.adapter = UserAdapter(this, userList)

    }

    private fun addDate() {
        userList.clear()
        userList.add(UserData("Milind1", "mm1@mm.mm", 123456, R.drawable.ic_phonepe))
        userList.add(UserData("Milind2", "mm2@mm.mm", 123456, R.drawable.ic_phonepe))
        userList.add(UserData("Milind3", "mm3@mm.mm", 123456, R.drawable.ic_phonepe))
        userList.add(UserData("Milind4", "mm4@mm.mm", 123456, R.drawable.ic_phonepe))
        userList.add(UserData("Milind5", "mm5@mm.mm", 123456, R.drawable.ic_phonepe))
    }
}