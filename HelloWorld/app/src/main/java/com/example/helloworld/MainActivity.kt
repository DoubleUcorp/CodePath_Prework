package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. Button Function
        findViewById<Button>(R.id.button).setOnClickListener{
            //Change Color
            Log.i("Yuyou", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.Gold))
        }


        findViewById<Button>(R.id.button2).setOnClickListener{
            Log.i("Yuyou", "Tapped on Second Button")
            findViewById<TextView>(R.id.textView).setText(findViewById<EditText>(R.id.editTextTextPersonName).text)
        }

        findViewById<Button>(R.id.button3).setOnClickListener{
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundcolor).setBackgroundColor(getResources().getColor(R.color.Dark_Grey))
        }
    }
}