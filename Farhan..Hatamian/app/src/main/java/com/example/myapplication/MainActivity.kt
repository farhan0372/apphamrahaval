package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.btn_dialog)
        btn.setOnClickListener {


            val builder=AlertDialog.Builder(this).create()
            var view=layoutInflater.inflate(R.layout.dialog_error,null)
            builder.setView(view)
            builder.setCancelable(false)
            builder.show()

            val btn_ok=view.findViewById<Button>(R.id.btn_ok)
            btn_ok.setOnClickListener {
                Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
                builder.dismiss()
            }

        }


    }
}