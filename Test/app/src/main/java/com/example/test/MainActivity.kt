package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val chekbox=findViewById<CheckBox>(R.id.checkBoxok);
        val btn=findViewById<Button>(R.id.checkBoxok);

        btn.setOnClickListener {


            if (chekbox.isChecked) {
                var intent: Intent = Intent(this, MainActivity2::class.java)
                finish()
                startActivity(intent)
            } else {
                Toast.makeText(this, "قوانین مطالعه نشده!", Toast.LENGTH_SHORT).show()
            }
        }









    }
}