package com.code_remote.classes.class2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.code_remote.classes.R
import kotlinx.android.synthetic.main.activity_main_resources.*

class MainActivity01Resources : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resources)

        //A layout reference
        R.layout.activity_main_resources

        //A reference to a view inside of a layout file
        R.id.id_of_a_view_inside_of_a_layout

        //A single string reference
        R.string.app_name

        //A color referecne
        R.color.colorPrimary

        //A reference to an Image
        R.mipmap.img_quote_01

        //With references you can't do anything it's just an ID to a pointer in memory.
        id_of_a_view_inside_of_a_layout.setImageResource(R.mipmap.img_quote_01)
    }


}