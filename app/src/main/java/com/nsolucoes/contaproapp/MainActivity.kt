package com.nsolucoes.contaproapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.nsolucoes.contaproapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    val isDark = mutableStateOf(false)

    fun toggleLightTheme(){
        isDark.value = !isDark.value
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide() // Tirando o titulo do APP.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.activity_main_nav_host_fragment)
        setupWithNavController(binding.bottomNavigationView, navController)
    }
}