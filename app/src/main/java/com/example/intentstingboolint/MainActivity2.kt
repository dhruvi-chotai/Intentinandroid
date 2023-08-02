package com.example.intentstingboolint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var txt:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val username = intent.getStringExtra("username")
        val age = intent.getIntExtra("age",0)
        val datatype = intent.getStringExtra("dataType")
        txt = findViewById(R.id.txt)
        val printSeq = "Hello, $username,\n" +
                "Dont think about age.... " +
                "$age is just a number.\n" +
                "you are $datatype happy"

        txt.text = printSeq




    }
}