package com.example.training06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btn : Button = findViewById(R.id.button_homekkn)
        btn.setOnClickListener(){
            var i2 : Intent = Intent(this, MainActivity::class.java)
            startActivity(i2)
        }
    }
}