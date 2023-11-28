package com.yordizisa.nutriforge

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button1 = findViewById<Button>(R.id.button1)


        // Set the welcome text, image, and other UI elements

       button1.setOnClickListener {
            val userName = editText.text.toString()

           if (userName.isNotEmpty()) {
               val intent = Intent(this, CreditActivity::class.java)
               intent.putExtra("userName", userName)
               startActivity(intent)
           }else{
               editText.error = "Inserta un nombre para continuar"
           }
        }
    }
}
