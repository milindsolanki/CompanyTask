package com.example.wayToCode.navAndRec

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wayToCode.R
import com.example.wayToCode.recyclerView.UserData
import kotlinx.android.synthetic.main.fragment_click_delete.*
import kotlinx.android.synthetic.main.fragment_click_delete.view.*
import java.util.ArrayList


class SwapDeleteFragment : Fragment(), DeleteItem {
    val dataList = ArrayList<UserData>()
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
        //ItemTouchHelper().attachToRecyclerView(view.rv_Delete)
        view.rv_Delete.adapter = DeleteAdapter(context, dataList, this)


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