package com.canhdinh.market.ui.activity.main_activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.canhdinh.market.R
import com.canhdinh.market.base.BaseActivity
import com.canhdinh.market.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var binding: ActivityMainBinding
    lateinit var controller: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        controller = findNavController(R.id.nav_host)

        binding.bottomNavigation.setupWithNavController(controller)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_navigation_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(controller) || super.onOptionsItemSelected(item)

    }
}