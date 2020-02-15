package com.code_remote.classes.class2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.code_remote.classes.R

class MainActivity00ConstraintLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint_layout)


        val ourButton = findViewById<Button>(R.id.ourCustomButton)
        ourButton.setOnClickListener {

            Toast.makeText(this, "Hello you clicked me", Toast.LENGTH_SHORT ).show()
        }


    }


}
