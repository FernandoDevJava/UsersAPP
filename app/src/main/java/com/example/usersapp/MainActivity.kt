package com.example.usersapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.usersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val teste = findViewById<View>(R.id.ic_next_page)

        teste.setOnClickListener {
            var intent = Intent(applicationContext, create_user::class.java)
            startActivity(intent)
        }

    }

}