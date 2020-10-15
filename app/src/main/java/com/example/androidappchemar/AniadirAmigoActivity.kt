package com.example.androidappchemar

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_amigo.*


class AniadirAmigoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amigo)

        buttonGuardar.setOnClickListener(){insertContact(editTextTextContact.toString(),editTextPhone.toString()) }

    }

    fun insertContact(name: String, email: String) {
        val intent = Intent(Intent.ACTION_INSERT).apply {
            type = ContactsContract.Contacts.CONTENT_TYPE
            putExtra(ContactsContract.Intents.Insert.NAME, name)
            putExtra(ContactsContract.Intents.Insert.EMAIL, email)
        }
    }
}