package com.example.wayToCode.navAndRec

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wayToCode.R
import com.example.wayToCode.recyclerView.UserData
import kotlinx.android.synthetic.main.fragment_click_delete.*
import kotlinx.android.synthetic.main.fragment_click_delete.view.*


class ClickDeleteFragment : Fragment(), DeleteItem {
    val dataList = ArrayList<UserData>()
    var swapCount = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_click_delete, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        addData()
        view.rv_Delete.layoutManager = LinearLayoutManager(context)
        view.rv_Delete.adapter = DeleteAdapter(context, dataList, this)
        view.swipe_refresh_layout.setOnRefreshListener {
            swapCount += 1
            if (swapCount > 0) {
                addData()
                Toast.makeText(context, "Done swap", Toast.LENGTH_SHORT).show()
            }
            (view.rv_Delete.adapter as DeleteAdapter).notifyDataSetChanged()
            view.swipe_refresh_layout.isRefreshing = false
        }

        val swipeHandler = object :
            ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                TODO("Not yet implemented")
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                dataList.removeAt(viewHolder.adapterPosition)
                (view.rv_Delete.adapter as DeleteAdapter).notifyDataSetChanged()
            }

        }

    }

    private fun addData() {
        dataList.add(UserData("Vishal", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("milind", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("sunny", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("pratik", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("bhavik", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("Vishal", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("milind", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("sunny", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("pratik", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("bhavik", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("Vishal", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("milind", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("sunny", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("pratik", "mm@mm.mm", 123456, R.drawable.nachos))
        dataList.add(UserData("bhavik", "mm@mm.mm", 123456, R.drawable.nachos))
    }


}