package com.sriyank.navigationcomponents.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.sriyank.navigationcomponents.R


class splashScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)

        view.findViewById<Button>(R.id.nxtbutton).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_splashScreenFragment_to_registerFragment)
        )

        return view
    }


}