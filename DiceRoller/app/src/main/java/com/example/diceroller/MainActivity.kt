package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()

          //  val result: TextView = findViewById(R.id.textView)
            //result.text = "6"

        //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        //toast.show()
        }
    }

    private fun rollDice() {
        val dice = Dice(26)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}