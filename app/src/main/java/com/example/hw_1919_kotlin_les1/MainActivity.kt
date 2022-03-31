package com.example.hw_1919_kotlin_les1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textInfo: TextView = findViewById(R.id.textView)
        val btnRandomKitty: Button = findViewById(R.id.button_random_kitty)
        val btnRandomCat: Button = findViewById(R.id.button_random_cat)

        btnRandomCat.setOnClickListener {
            textInfo.text =
                CatInfoHandler().getCatInfo(CatInfoHandler().getRandomCat(CatInfoHandler().catList))

        }

        btnRandomKitty.setOnClickListener {
            textInfo.text = CatInfoHandler().getKittyInfo(CatInfoHandler().getRandomKitty(CatInfoHandler().kittyList))

        }
        CatInfoHandler().comparingClassObject()

    }
}