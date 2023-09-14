package com.example.entreactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val nom=intent.getStringExtra("NombreA1")
        val tvactivity2=findViewById<TextView>(R.id.TVActivity2)
        tvactivity2.append("  \n $nom")
        val n=intent.getFloatExtra("numero",0f)
        tvactivity2.append("  \n $n")
    }
}
