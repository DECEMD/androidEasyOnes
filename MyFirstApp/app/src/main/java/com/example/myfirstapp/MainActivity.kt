package com.example.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(kek: Bundle?) {
        super.onCreate(kek)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var user = User("Sergey","12313", 22)
        user.addAge(15)
        user.printUserInfo()

    }


}

