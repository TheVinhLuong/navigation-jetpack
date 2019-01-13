package com.example.ltvlu.navitaion_jetpack.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation

import com.example.ltvlu.navitaion_jetpack.R
import kotlinx.android.synthetic.main.fragment_splash.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener { 
            Navigation.findNavController(it).navigate(R.id.requireLoginNav)
        }
        btn_home.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.directToHomeNav, null, NavOptions.Builder().setPopUpTo(R.id.splashFragment, true).build())
        }
    }
}
