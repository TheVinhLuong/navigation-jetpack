package com.example.ltvlu.navitaion_jetpack

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val finalHost = NavHostFragment.create(R.navigation.global_graph)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, finalHost)
            .setPrimaryNavigationFragment(finalHost) // this is the equivalent to app:defaultNavHost="true"
            .commitNow()
    }
}
