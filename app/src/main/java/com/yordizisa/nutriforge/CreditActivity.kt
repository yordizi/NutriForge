package com.yordizisa.nutriforge

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CreditActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        val userName = intent.getStringExtra("userName")

        val tvInformativo = findViewById<TextView>(R.id.tvInformativo)
        val contactButton = findViewById<Button>(R.id.buttonContacto)

        // nombre de usuario y version de la app
        tvInformativo.text = "Usuario $userName, estás usando la versión 1 de NutriForge."

        contactButton.setOnClickListener {
            // lanzar el intent implícito
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse("mailto:")

            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("yordirb@gmail.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Consulta de la app NutriForge")
            startActivity(Intent.createChooser(emailIntent, "Enviar correo"))
        }
    }
}