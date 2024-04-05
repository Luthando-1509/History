package com.example.history

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private val historicalFigures = mapOf(
        50 to "Michael Jackson",
        51 to "Christian Oliver",
        52 to "Chris Cornell",
        53 to "John Denver",
        54 to "William Richards",
        55 to "Elizabeth Pena",
        56 to "Abraham Lincoln",
        57 to "Prince",
        58 to "Randy Savage",
        59 to "George Best",
        60 to "Moses Malone",
        61 to "Bill Paxton",
        62 to "Martin Luther",
        63 to "Robin Williams",
        64 to "Karl Max",
        65 to "Molly brown",
        66 to "Tom Petty",
        67 to "Angry Grandpa",
        68 to "James Avery",
        69 to "Marco Polo",
        70 to "Louis Vuitton"


    )

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEditText = findViewById<EditText>(R.id.ageEditText)
        val generateButton = findViewById<Button>(R.id.generateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val clearButton = findViewById<Button>(R.id.clearButton)

        clearButton.setOnClickListener {
            ageEditText.text.clear()


            generateButton.setOnClickListener {
                val age = ageEditText.text.toString().toIntOrNull()
                age?.let {
                    val figure = historicalFigures[age]
                    if (figure != null) {
                        resultTextView.text = "You are $age years old, which is the same age as $figure."
                    } else {
                        resultTextView.text =
                            "There is no historical figure in our records who was $age years old."
                    }
                } ?: run {
                    resultTextView.text = "Please enter a valid age."
                }
            }
        }
    }
}