package com.example.busapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        val btn_main_date:Button=findViewById(R.id.btn_main_date)
        val btn_main_local:Button=findViewById(R.id.btn_main_local)
        val btn_main_save:Button=findViewById(R.id.btn_main_save)

        btn_main_date.setOnClickListener(){
            startActivity(Intent(this,DateActivity::class.java))
        }
        btn_main_local.setOnClickListener(){
            startActivity(Intent(this,PlaceActivity::class.java))
        }
        btn_main_save.setOnClickListener(){

        }

    }


}