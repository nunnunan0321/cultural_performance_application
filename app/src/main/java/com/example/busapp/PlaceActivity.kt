package com.example.busapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.place_activity)
        val btn_place_sumbit: Button =findViewById(R.id.btn_place_sumbit)
        btn_place_sumbit.setOnClickListener(){
            startActivity(Intent(this,WatchActivity::class.java))
        }
    }
}