package com.example.androidappchemar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    // Opciones a pulsar un estado del menú
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.menu_acerca_de -> {
                menuAcercaDe()
                true
            }
            R.id.menu_nota -> {
                menuOtraOpcion()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // Opción de menu
    private fun menuOtraOpcion() {
        // Escribimos en el log
        // https://developer.android.com/studio/debug/am-logcat?hl=es
        Log.i("ETIQUETA", "Mensaje de log")
        Toast.makeText(this, "Has pulsado Otra Opción", Toast.LENGTH_SHORT).show()
    }

    // Muestra la actividad Acerca De
    private fun menuAcercaDe() {
        val intent = Intent(this, AcercaDeActivity::class.java)
        startActivity(intent)
    }
}