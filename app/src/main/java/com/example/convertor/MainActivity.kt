package com.example.convertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.convertor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        Log.i("onCreate","------")
        drawerLayout = binding.drawerLayout
        setContentView(view)
        val navController = this.findNavController(R.id.my_NavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)

        appBarConfiguration = AppBarConfiguration(navController.graph,drawerLayout)
        NavigationUI.setupWithNavController(binding.navView, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        Log.i("onSupportNavigateUp","------")
        val navController = this.findNavController(R.id.my_NavHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}