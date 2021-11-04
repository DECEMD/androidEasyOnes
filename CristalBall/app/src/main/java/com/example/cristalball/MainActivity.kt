package com.example.cristalball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristalball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tvResult.setOnClickListener {
            binding.tvResult.text = getIgra()
        }
    }
    private fun getIgra(): String{
        return resources.getStringArray(R.array.igra)[randomNumber()]
    }
    private fun randomNumber(): Int{
        val size = resources.getStringArray(R.array.igra).size - 1
        return(0..size).random()
    }
}