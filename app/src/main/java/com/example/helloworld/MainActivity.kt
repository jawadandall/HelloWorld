package com.example.helloworld

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.introButton)
        button.setOnClickListener{
            Log.v("Hello World", "Button Clicked!")
            Toast.makeText(this, "Only my love grows stronger.", Toast.LENGTH_LONG).show()
        }
    }
}