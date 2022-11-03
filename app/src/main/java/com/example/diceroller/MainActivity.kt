package com.example.diceroller
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var printRandomNumberView: TextView

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printRandomNumberView = findViewById(R.id.randomNumberView)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            Log.d("rollbutton", " pressed button")
            printRandomNumber()
            rollDice()
        }
    }

    fun printRandomNumber(): Int {

        val randomValues = Random.nextInt(1, 6)
        printRandomNumberView.text = randomValues.toString()
        return randomValues
    }

    fun rollDice() {

        val diceRoll = printRandomNumber()
        val diceLayout: ImageView = findViewById(R.id.imageView)

        when (diceRoll) {
            1 -> diceLayout.setImageResource(R.drawable.d1)
            2 -> diceLayout.setImageResource(R.drawable.d2)
            3 -> diceLayout.setImageResource(R.drawable.d3)
            4 -> diceLayout.setImageResource(R.drawable.d4)
            5 -> diceLayout.setImageResource(R.drawable.d5)
            6 -> diceLayout.setImageResource(R.drawable.d6)
        }
    }
}