package com.example.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_2.databinding.Activity1Binding

class activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener {
            goToSecond()
        }
        binding.toAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToSecond() {
        val intent = Intent(this, activity2::class.java)
        startActivity(intent)
    }

    private fun goToAbout() {
        val intent = Intent(this, activityAbout::class.java)
        startActivity(intent)
    }
}