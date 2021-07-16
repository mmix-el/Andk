package xyz.mmixel.andk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.result)
        findViewById<Button>(R.id.send_button).apply {
            setOnClickListener{
                rollDice()
            }
        }
    }

    private fun rollDice() {
        val resultInt: Int = (1..6).random()
        textView.text = resultInt.toString()
    }
}