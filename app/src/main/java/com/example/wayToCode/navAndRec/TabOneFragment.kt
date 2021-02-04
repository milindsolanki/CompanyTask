package com.example.wayToCode.navAndRec

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.fragment_tab_move_data.view.*
import kotlinx.android.synthetic.main.fragment_tab_one.*
import kotlinx.android.synthetic.main.fragment_tab_one.view.*
import java.lang.ClassCastException


class TabOneFragment : Fragment() {
    lateinit var fragment: Fragment
    lateinit var dataTranfer: DataTranfer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tab_one, container, false)
        intiView(view)
        return view

    }

    private fun intiView(view: View) {
        view.btnSend.setOnClickListener {


            dataTranfer.sendData(
                view.etdEmail.text.toString().trim(),
                view.etdPassword.text.toString().trim()
            )

        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            dataTranfer = activity as DataTranfer
        } catch (e: ClassCastException) {
            throw ClassCastException("Error")
        }
    }

}