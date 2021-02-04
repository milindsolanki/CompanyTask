package com.example.wayToCode.fragmentRecycleView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wayToCode.R
import com.example.wayToCode.recyclerViewTaskTwo.ListName
import com.example.wayToCode.recyclerViewTaskTwo.SelectItem
import kotlinx.android.synthetic.main.activity_recycler_v_iew.*
import kotlinx.android.synthetic.main.fragment_rv.*
import kotlinx.android.synthetic.main.fragment_rv.view.*


class RvFragment : Fragment() {
    val list = ArrayList<ListName>()
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rv, container, false)
        intiView(view)
        return view

    }

    private fun intiView(view: View) {
        addDate()
        view.rvFrag.layoutManager = LinearLayoutManager(activity)
        view.rvFrag.adapter = FragRvAdapter(list, activity)

    }


    private fun addDate() {
        list.add(ListName("Linear"))
        list.add(ListName("Fragment"))
        list.add(ListName("Intent"))
        list.add(ListName("RecyclerView"))
        list.add(ListName("ImageView"))
    }
}