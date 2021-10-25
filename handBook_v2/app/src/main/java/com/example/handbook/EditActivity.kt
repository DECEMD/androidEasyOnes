package com.example.handbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.handbook.databinding.ActivityEditBinding
import com.example.handbook.databinding.ActivityMainBinding
import java.util.zip.Inflater

class EditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditBinding
    private var indexImage = 0
    private var imageId = R.drawable.gta

    private val imageIdList = listOf(
        R.drawable.gta,
        R.drawable.amogus,
        R.drawable.fort,
        R.drawable.main,
        R.drawable.sims
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEditBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.imageView.setImageResource(imageId)
        initButtons()

    }

    private fun initButtons() = with(binding){
        bNext.setOnClickListener {
            indexImage++
            if(indexImage > imageIdList.size - 1) indexImage = 0
            imageId = imageIdList[indexImage]
            imageView.setImageResource(imageId)
        }
        bDone.setOnClickListener {
            val game = Game(imageId, edTitle.text.toString(), edDesc.text.toString())
            val editIntent = Intent().apply {
                putExtra("game", game)
            }
            setResult(RESULT_OK, editIntent)
            finish()
        }
    }

}