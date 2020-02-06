package com.android.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //resourse linking
        val input:EditText = findViewById(R.id.editText)
        val submit:Button = findViewById(R.id.click)
        submit.setOnClickListener {

            val name:String = input.text.toString()
            Toast.makeText(this,"My first kt app.",Toast.LENGTH_LONG).show()
        }


    }
}
