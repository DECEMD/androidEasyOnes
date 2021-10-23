package com.example.handbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.handbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = GameAdapter()
    private val imageIdList = listOf(
        R.drawable.gta,
        R.drawable.amogus,
        R.drawable.fort,
        R.drawable.main,
        R.drawable.sims
    )
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity,3)
            rcView.adapter =adapter
            buttonAdd.setOnClickListener{
                if(index>4) index = 0
                val game = Game(imageIdList[index], "Game ${index+1}")
                adapter.addGame(game)
                index++
            }
        }
    }
}