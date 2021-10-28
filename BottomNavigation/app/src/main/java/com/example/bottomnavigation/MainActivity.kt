package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bottomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bNav.selectedItemId = R.id.item2 // vibiraet preview item
        binding.bNav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.item1 -> {
                    Toast.makeText(this,"Download", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}
/* will fix on setOnItemSelectedListener
binding.bNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
            }
            true
        }

 */