package com.example.ltvlu.navitaion_jetpack.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

import com.example.ltvlu.navitaion_jetpack.R
import com.example.ltvlu.navitaion_jetpack.RequireLoginNavDirections
import kotlinx.android.synthetic.main.fragment_shop.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ShopFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        retainInstance = true
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_product.setOnClickListener {
            val action = RequireLoginNavDirections.actionGlobalCheckoutFragment().setProductName(et_product_name.text.toString())
            Navigation.findNavController(parentFragment!!.parentFragment!!.view!!).navigate(action)
        }
    }
}
