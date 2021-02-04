package com.example.wayToCode.navAndRec

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.fragment_tab_two.view.*


class TabTwoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tab_two, container, false)
        intiView(view)
        return view
    }

    fun intiView(view: View) {

    }

    fun dataRecive(email: String, password: String) {
        view?.txtEmail?.text = email
        view?.txtPassword?.text = password
    }


}