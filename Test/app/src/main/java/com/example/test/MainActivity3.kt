package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val edittext1=findViewById<EditText>(R.id.editTextTextPersonName3)
        val edittext2=findViewById<EditText>(R.id.editTextTextPersonName2)
        val edittext3=findViewById<EditText>(R.id.editTextTextPersonName4)
        val spinneer=findViewById<Spinner>(R.id.spinner)
        val numberrr=findViewById<EditText>(R.id.editTextNumber)
        val btnsubmit=findViewById<Button>(R.id.button)

        btnsubmit.setOnClickListener{
            var intent: Intent = Intent(this, MainActivity2::class.java)
            finish()
            startActivity(intent)
        }



    }
}