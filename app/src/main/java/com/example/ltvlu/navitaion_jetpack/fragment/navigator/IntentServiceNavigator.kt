package com.example.ltvlu.navitaion_jetpack.fragment.navigator

import android.app.IntentService
import android.os.Bundle
import androidx.navigation.NavDestination
import androidx.navigation.NavOptions
import androidx.navigation.Navigator

class IntentServiceNavigator: Navigator<IntentServiceDestination>(){
    override fun navigate(
        destination: IntentService,
        args: Bundle?,
        navOptions: NavOptions?,
        navigatorExtras: Extras?
    ): NavDestination? {

    }

    override fun navigate(
        destination: IntentServiceDestination,
        args: Bundle?,
        navOptions: NavOptions?,
        navigatorExtras: Extras?
    ): NavDestination? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createDestination(): IntentServiceDestination {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun popBackStack(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

