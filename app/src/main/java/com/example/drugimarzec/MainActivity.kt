package com.example.drugimarzec

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder
class MainActivity : AppCompatActivity() {
    lateinit var pizza: CheckBox
    lateinit var herbata: CheckBox
    lateinit var kebab: CheckBox
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Restauracja"
        pizza = findViewById(R.id.checkBox1)
        herbata = findViewById(R.id.checkBox2)
        kebab = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Wybrane pozycje")
            if (pizza.isChecked) {
                result.append("\nPizza 35zl")
                totalAmount += 35
            }
            if (herbata.isChecked) {
                result.append("\nHerbata 10zl")
                totalAmount += 10
            }
            if (kebab.isChecked) {
                result.append("\nKebab 20zl")
                totalAmount += 20
            }
            result.append("\nSuma: " + totalAmount + "zl")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}