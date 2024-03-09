package com.example.training06

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Dilan
        var btn: Button = findViewById(R.id.button_dilan)
        btn.setOnClickListener() {
            var i1: Intent = Intent(this, Activity_2::class.java)
            startActivity(i1)
        }
        // 2. KKN
        var btn2: Button = findViewById(R.id.button_kkn)
        btn2.setOnClickListener() {
            var i2: Intent = Intent(this, MainActivity3::class.java)
            startActivity(i2)
        }
        // 3. Miracle
        var btn3: Button = findViewById(R.id.button_miracle)
        btn3.setOnClickListener() {
            var i3: Intent = Intent(this, MainActivity4::class.java)
            startActivity(i3)
        }
        // 4. Ps2
        var btn4: Button = findViewById(R.id.button_ps2)
        btn4.setOnClickListener() {
            var i4: Intent = Intent(this, MainActivity5::class.java)
            startActivity(i4)
        }
        //5 warkop
        var btn5: Button = findViewById(R.id.button_warkop)
        btn5.setOnClickListener() {
            var i5: Intent = Intent(this, MainActivity6::class.java)
            startActivity(i5)
        }
        //6 habibi
        var btn6: Button = findViewById(R.id.button_habibi)
        btn6.setOnClickListener() {
            var i6: Intent = Intent(this, MainActivity7::class.java)
            startActivity(i6)
        }
        //7. Pengabdi Setan
        var btn7: Button = findViewById(R.id.button_ps)
        btn7.setOnClickListener() {
            var i7: Intent = Intent(this, MainActivity8::class.java)
            startActivity(i7)
        }
        //8 Laskar
        var btn8: Button = findViewById(R.id.button_laskar)
        btn8.setOnClickListener() {
            var i8: Intent = Intent(this, MainActivity9::class.java)
            startActivity(i8)
        }
        //9 Dilan 91
        var btn9: Button = findViewById(R.id.button_dilan2)
        btn9.setOnClickListener() {
            var i9: Intent = Intent(this, MainActivity10::class.java)
            startActivity(i9)
        }
        //10 Sewu dino
        var btn10: Button = findViewById(R.id.button_sewu)
        btn10.setOnClickListener() {
            var i10: Intent = Intent(this, MainActivity11::class.java)
            startActivity(i10)
        }
        //About me
        var btn11: Button = findViewById(R.id.button_aboutme)
        btn11.setOnClickListener() {
            var i11: Intent = Intent(this, MainActivity12::class.java)
            startActivity(i11)
        }
    }
}