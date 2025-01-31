package com.example.fooddeliver

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fooddeliver.databinding.ActivityMainBinding
import com.example.fooddeliver.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private val binding : ActivitySplashScreenBinding by lazy {
        ActivitySplashScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        Handler().postDelayed({
            intent = Intent(this, LocationPage::class.java)
            startActivity(intent)
        }, 2500)


        
    }
}