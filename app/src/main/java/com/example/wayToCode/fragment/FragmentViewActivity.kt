package com.example.wayToCode.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_fragment_view.*

class FragmentViewActivity : AppCompatActivity(),View.OnClickListener{
    lateinit var fragment: Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_view)
        fragment=OneFragment()
        replcwFragment(fragment)
        intiView()

    }

    private fun replcwFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()

    }

    private fun intiView() {
        btnOne.setOnClickListener(this)
        btnsecond.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0)
        {
            btnOne->
            {

                fragment=OneFragment()
                replcwFragment(fragment)
            }
            btnsecond->
            {
                replcwFragment(SecondFragment())
            }

        }
    }
}