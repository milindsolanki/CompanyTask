package com.example.wayToCode.fragmentRecycleView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_frg_recycler_view.*

class FrgRecyclerViewActivity : AppCompatActivity() {
    lateinit var fragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frg_recycler_view)
        intiView()
    }

    private fun intiView() {

        btn.setOnClickListener { replceFragment(RvFragment()) }
    }


    private fun replceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fram, fragment).commit()
    }
}