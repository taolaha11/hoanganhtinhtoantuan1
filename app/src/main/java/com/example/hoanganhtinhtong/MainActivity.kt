package com.example.hoanganhtinhtong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber1: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById(R.id.editTextNumber1)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        textViewResult = findViewById(R.id.textViewResult)
    }

    fun calculateSum(view: View) {
        val number1 = editTextNumber1.text.toString().toDouble()
        val number2 = editTextNumber2.text.toString().toDouble()
        val sum = number1 + number2
        textViewResult.text = "Result: $sum"
    }
}
