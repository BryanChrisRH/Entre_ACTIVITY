package com.example.entreactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var bactivity1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bactivity1=findViewById(R.id.Bactivity1)
        bactivity1.setOnClickListener {

            val intent=Intent(applicationContext,MainActivity2::class.java)
            val etNombre=findViewById<EditText>(R.id.ETNombre)
            val nom:String=etNombre.text.toString()
            val num=findViewById<EditText>(R.id.numero)
            val n = num.text.toString().toFloat()

            intent.putExtra("NombreA1",nom)
            intent.putExtra("numero",n)
            startActivity(intent)

        }

    }
}