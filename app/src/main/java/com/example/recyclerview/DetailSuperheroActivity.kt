package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailSuperheroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABLE)

        val imgSuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgSuperhero.setImageResource(superhero?.Imgsuperhero!!)
        nameSuperhero.text = superhero.Namesuperhero
        descSuperhero.text = superhero.Descsuperhero


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }

}