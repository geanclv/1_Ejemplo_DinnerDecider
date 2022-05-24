package com.geancarloleiva.a1_ejemplo_dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    val lstFood = arrayListOf("pizza", "burguer", "pollo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDecide: Button = findViewById(R.id.btnDecide)
        btnDecide.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(lstFood.count())

            val lblDecide: TextView = findViewById(R.id.lblDecision)
            lblDecide.text = lstFood[randomFood]
        }

        val btnAddFood: Button = findViewById(R.id.btnAddFood)
        btnAddFood.setOnClickListener{
            val txtFood: EditText = findViewById(R.id.txtFood)
            val newFood = txtFood.text.toString()

            if(newFood.isNotEmpty() && newFood.isNotBlank()){
                lstFood.add(newFood)
                txtFood.setText("")
                Toast.makeText(this, "Comida agregada", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Debe agregar una comida", Toast.LENGTH_SHORT).show()
            }
        }
    }
}