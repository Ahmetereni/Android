package com.example.brwordle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val et1 = findViewById<EditText>(R.id.et1)
        val tv=findViewById<TextView>(R.id.textView)
        val submit = findViewById<Button>(R.id.biButon)
        val b1=findViewById<Button>(R.id.b1)

        val randnum=GenerateRandom()
        var temp=""

        b1.setOnClickListener {
            temp=temp+b1.text.toString()
            tv.setText(temp)
        }

    }
    fun GenerateRandom():List<Int> {
        val myset= mutableSetOf<Int>()
        while (myset.size!=4)
        {
            myset.add((0..9).random())
        }
        val list=myset.toList()
        return list

    }


}