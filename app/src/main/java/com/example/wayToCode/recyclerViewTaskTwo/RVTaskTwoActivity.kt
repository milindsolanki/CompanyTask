package com.example.wayToCode.recyclerViewTaskTwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_r_v_task_two.*

class RVTaskTwoActivity : AppCompatActivity(), SelectItem, SearchView.OnQueryTextListener {
    val list = ArrayList<ListName>()
    var mAdapter: RvTaskTwoAdapter? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r_v_task_two)
        searchView.setOnQueryTextListener(this)
        intiView()
    }

    private fun intiView() {
        addData()
        rvTaskTwo.layoutManager = LinearLayoutManager(this)
        mAdapter = RvTaskTwoAdapter(this, list, this)
        rvTaskTwo.adapter=mAdapter
    }

    override fun onClick(name: String) {
        super.onClick(name)
        val intent = Intent(this, RvIntentTaskTwoActivity::class.java)
        intent.putExtra("TITLE", name)
        startActivity(intent)
    }

    private fun addData() {
        list.add(ListName("Fibonacci Series"))
        list.add(ListName("PrimeNumber"))
        list.add(ListName("String Palindrome"))
        list.add(ListName("Integer Palindrome"))
        list.add(ListName("Armstrong number"))
        list.add(ListName("Factorial"))
        list.add(ListName("Leap year"))
        list.add(ListName("Reverse Number"))
        list.add(ListName("Swap Two Number"))
        list.add(ListName("Remove Same Number In Array"))

    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        val userInput = newText!!.toLowerCase()
        val list1 = ArrayList<ListName>()
        for (data in list) {
            if (data.itemName.toLowerCase().contains(userInput)){
                list1.add(data)
            }
        }
        mAdapter!!.details(list1)
        return true

    }
}