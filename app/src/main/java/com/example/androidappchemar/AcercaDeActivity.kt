package com.example.androidappchemar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AcercaDeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)


    }

    private fun abrirUrl(url:String){
        val intent = Intent (
            Intent.ACTION_VIEW,
            Uri.parse(url)
        )
        startActivity(intent)
    }
}