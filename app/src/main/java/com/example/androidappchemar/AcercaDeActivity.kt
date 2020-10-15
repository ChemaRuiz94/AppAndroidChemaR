package com.example.androidappchemar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_acerca_de.*

class AcercaDeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)

        acercaBtnTwitter.setOnClickListener { abrirURL("https://twitter.com/ChemaRuizL") }
        acercaBtnGitHub.setOnClickListener { abrirURL("https://github.com/ChemaRuiz94") }
        acercaBtnCorreo.setOnClickListener { mandarCorreo("chemaruiz94@gmail.com.com", "Prueba", "Texto de prueba") }

    }

    //direccion url
    private fun abrirURL(url:String){
        val intent = Intent (
            Intent.ACTION_VIEW,
            Uri.parse(url)
        )
        startActivity(intent)
    }

    // Mandar un email
    private fun mandarCorreo(receptor: String, asunto: String, mensaje: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.data = Uri.parse("mailto:")
        intent.type = "text/plain"

        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(receptor))
        intent.putExtra(Intent.EXTRA_SUBJECT, asunto)
        intent.putExtra(Intent.EXTRA_TEXT, mensaje)
        try {
            startActivity(Intent.createChooser(intent, "Enviar usando..."))
        } catch (e: Exception) {
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }

    }
}