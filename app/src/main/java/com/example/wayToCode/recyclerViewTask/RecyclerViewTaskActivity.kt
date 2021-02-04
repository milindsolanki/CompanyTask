package com.example.wayToCode.recyclerViewTask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wayToCode.R
import com.example.wayToCode.recyclerView.UserData
import kotlinx.android.synthetic.main.activity_recycler_view_task.*

class RecyclerViewTaskActivity : AppCompatActivity(), OnClickInterFace {

    val userList = ArrayList<RvTaskData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_task)
        intiView()
    }

    private fun intiView() {
        addData()


        horizontalView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        horizontalView.adapter = RvTaskAdapter(this, userList, this)
        gridView.layoutManager = GridLayoutManager(this, 3)
        gridView.adapter = RvTaskAdapter(this, userList, this)
        linearView.layoutManager = LinearLayoutManager(this)
        linearView.adapter = RvTaskAdapter(this, userList, this)

    }

    override fun onClickItem() {
        super.onClickItem()
        Toast.makeText(this, "ItemClick", Toast.LENGTH_SHORT).show()
    }

    private fun addData() {
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))
        userList.add(RvTaskData("PhonePe", R.drawable.ic_phonepe))

    }
}