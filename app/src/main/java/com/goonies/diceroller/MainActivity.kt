package com.goonies.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Accediendo a las vistas
        val rollButton: Button = findViewById(R.id.roll_button)

        // rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            // Mostramos un mensaje en la pantalla utilizando "Toast"
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }


    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val diceImage: ImageView = findViewById(R.id.roll_image)
        val diceNumber = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Asignando una imágen a nuestra ImageView
        diceImage.setImageResource(diceNumber)

    }
}