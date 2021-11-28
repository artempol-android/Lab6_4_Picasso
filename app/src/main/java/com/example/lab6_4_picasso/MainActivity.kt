package com.example.lab6_4_picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lab6_4_picasso.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val polytechURL = "https://ivteleradio.ru/images/2017/6/2/7accc16664a74ff9a6d92b432ae05561.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("Thread: ", Thread.currentThread().name)

        loadPicture()
    }

    private fun loadPicture() {
        Picasso.get().load(polytechURL).into(binding.imageView)
    }
}


