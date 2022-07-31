package com.sriyank.navigationcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
//import com.sriyank.navigationcomponents.Fragments.Home
//import com.sriyank.navigationcomponents.Fragments.Profile
//import com.sriyank.navigationcomponents.Fragments.Settings


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.fragment_container)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNavigationView.setupWithNavController(navController)

    }
}



