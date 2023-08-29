package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        //This tells the app that when the user clicks the button this will happen
        button.setOnClickListener{
           Log.v("Helloworld","Button clicked!")
            //This displays a message when button is pressed
            Toast.makeText(this,"Hello to you too!",Toast.LENGTH_SHORT).show()
        }
    }
}