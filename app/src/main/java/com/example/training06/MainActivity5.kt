package com.example.training06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var btn : Button = findViewById(R.id.button_homeps2)
        btn.setOnClickListener(){
            var i : Intent = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}