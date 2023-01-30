package com.example.numble

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ansView = findViewById<TextView>(R.id.ansView)

        val roundView1 = findViewById<TextView>(R.id.roundView1)
        val roundView2 = findViewById<TextView>(R.id.roundView2)
        val roundView3 = findViewById<TextView>(R.id.roundView3)
        val roundView4 = findViewById<TextView>(R.id.roundView4)
        val roundView5 = findViewById<TextView>(R.id.roundView5)

        val resultView1 = findViewById<TextView>(R.id.result1)
        val resultView2 = findViewById<TextView>(R.id.result2)
        val resultView3 = findViewById<TextView>(R.id.result3)
        val resultView4 = findViewById<TextView>(R.id.result4)
        val resultView5 = findViewById<TextView>(R.id.result5)

        val b0 = findViewById<Button>(R.id.button0)
        val b1 = findViewById<Button>(R.id.button1)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)
        val b4 = findViewById<Button>(R.id.button4)
        val b5 = findViewById<Button>(R.id.button5)
        val b6 = findViewById<Button>(R.id.button6)
        val b7 = findViewById<Button>(R.id.button7)
        val b8 = findViewById<Button>(R.id.button8)
        val b9 = findViewById<Button>(R.id.button9)

        val enterButton = findViewById<Button>(R.id.enterButton)
        val deleteButton = findViewById<Button>(R.id.deleteButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        var round = 0
        var tempRoundView: TextView = roundView1
        var tempResultView: TextView = resultView1

        val answer = GenerateRandomList()


        fun roundViewUpdater(round: Int): List<TextView> {
            if (round == 0) {
                tempRoundView = roundView1
                tempResultView = resultView1
            } else if (round == 1) {
                tempRoundView = roundView2
                tempResultView = resultView2
            } else if (round == 2) {
                tempRoundView = roundView3
                tempResultView = resultView3
            } else if (round == 3) {
                tempRoundView = roundView4
                tempResultView = resultView4
            } else if (round == 4) {
                tempRoundView = roundView5
                tempResultView = resultView5
            }

            return listOf<TextView>(tempRoundView, tempResultView)
        }


        val a = listOf<TextView>(roundView1, roundView2, roundView3, roundView4)

        var tmp = ""

        b0.setOnClickListener {

            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b0.text.toString()
            tempRoundView.setText(tmp)

        }
        b1.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b1.text.toString()
            tempRoundView.setText(tmp)
        }
        b2.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b2.text.toString()
            tempRoundView.setText(tmp)
        }
        b3.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b3.text.toString()
            tempRoundView.setText(tmp)
        }
        b4.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b4.text.toString()
            tempRoundView.setText(tmp)
        }
        b5.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b5.text.toString()
            tempRoundView.setText(tmp)
        }
        b6.setOnClickListener {

            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b6.text.toString()
            tempRoundView.setText(tmp)
        }
        b7.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b7.text.toString()
            tempRoundView.setText(tmp)
        }
        b8.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b8.text.toString()
            tempRoundView.setText(tmp)
        }
        b9.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tmp = tempRoundView.text.toString()
            tmp = tmp + b9.text.toString()
            tempRoundView.setText(tmp)
        }

        enterButton.setOnClickListener {


            tempRoundView = roundViewUpdater(round)[0]
            tempResultView = roundViewUpdater(round)[1]


            if (tempRoundView.text.toString() == answer.joinToString(separator = "")) {
                ansView.setText(tempRoundView.text.toString())
                Toast.makeText(applicationContext, "TEBRİKLER !", Toast.LENGTH_LONG).show()
            }


            var guess = tempRoundView.text.toString()
            if (guess.length < 4) {

            } else {
                val plus = calculateResult(guess, answer)[0]
                val negative = calculateResult(guess, answer)[1]

                tempResultView.setText("+" + plus.toString() + "  " + negative.toString())

                round += 1
                tmp = ""

                if(round == 5){
                    ansView.setText(answer.joinToString(separator = ""))
                }
            }


        }

        resetButton.setOnClickListener {
            finish()
            startActivity(intent)


        }
        deleteButton.setOnClickListener {
            tempRoundView = roundViewUpdater(round)[0]
            tempRoundView.text = tempRoundView.text.toString().dropLast(1)

        }


    }

}



