package com.example.intentstingboolint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    private lateinit var age_et:EditText
    private lateinit var name_et:EditText
    private lateinit var radiogrp:RadioGroup
    private lateinit var submit_btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        age_et = findViewById(R.id.age_et)
        name_et = findViewById(R.id.name_et)
        radiogrp = findViewById(R.id.radiogrp)
        submit_btn = findViewById(R.id.submit_btn)
        submit_btn.setOnClickListener{
            val uname = name_et.text.toString()
            val age = age_et.text.toString()
            val selectedRadioBtnId = radiogrp.checkedRadioButtonId
            val selectedRadioButton = findViewById<RadioButton>(selectedRadioBtnId)

            if(uname.isNotEmpty() && age.isNotEmpty() && selectedRadioButton!=null)
            {
                val dataType = if(selectedRadioButton.id == R.id.yes_rbtn) "yes" else "no"
                val age = age.toInt()

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("username", uname)
                intent.putExtra("age", age)
                intent.putExtra("dataType", dataType)
                startActivity(intent)


                }
            }
        }


    }
