package com.example.busapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.date_activity)

        val btn_date_sendResult: Button =findViewById(R.id.btn_date_sendResult)
        btn_date_sendResult.setOnClickListener(){
            startActivity(Intent(this,WatchActivity::class.java))
        }

    }
}