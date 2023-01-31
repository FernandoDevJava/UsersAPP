package com.example.usersapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.usersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val teste = findViewById<View>(R.id.ic_next_page)

        teste.setOnClickListener {
            var intent = Intent(applicationContext, create_user::class.java)
            startActivity(intent)


            binding.btnLogin.setOnClickListener(this)

        }

    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_login) {
            calculate()
        }
    }

    private fun calculate() {
        Toast.makeText(this, "Fui acionado", Toast.LENGTH_LONG).show()
    }

}