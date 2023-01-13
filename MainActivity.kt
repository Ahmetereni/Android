package com.example.newstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tvSonuc=findViewById<TextView>(R.id.tvSonuc)
        val b=findViewById<Button>(R.id.biButon)


        b.setOnClickListener {


            if (et1.text.isNotEmpty() && et2.text.isNotEmpty()) {
                val first = et1.text.toString().toInt()
                val second = et2.text.toString().toInt()
                val end = AddStuff.multiply(first, second)
                tvSonuc.text("" + end)


            }



        }

    }
}
