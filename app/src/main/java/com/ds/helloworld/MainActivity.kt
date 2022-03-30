package com.ds.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val rollButton: Button = findViewById(R.id.button)
            rollButton.setOnClickListener {
                val toast = Toast.makeText(this, "Rolou o dado!", Toast.LENGTH_SHORT).show()
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = "6"
                rollDice()


            }
    }
    class Dice(val numSides: Int) {

        fun roll(): Int {
            val numero = (1..numSides).random()
            return(numero)
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
        val diceImage:  ImageView = findViewById(R.id.imageView2)
        diceImage.setImageResource(R.drawable.dice_2)

    }
}
