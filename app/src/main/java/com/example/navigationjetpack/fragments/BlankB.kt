package com.example.navigationjetpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigationjetpack.R

/**
 * A simple [Fragment] subclass.
 * Use the [BlankB.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank_b, container, false)
        //Linking button with xmml
        val button = view.findViewById<Button>(R.id.button)
        //OnClick methode for navigate between fragments
        button.setOnClickListener {
            findNavController().navigate(R.id.action_blankB_to_blankA)
        }
        return view.rootView
    }

}