package com.code_remote.classes.class2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.code_remote.classes.R
import com.code_remote.classes.class2.data.QUOTES
import kotlinx.android.synthetic.main.activity_main_simple_quotes.*
import kotlin.random.Random

class MainActivity02SimpleQuotes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_simple_quotes)

        old_quote_button.setOnClickListener {
            changeQuote()
        }
    }

    private fun changeQuote() {
        old_quote_text.text = QUOTES[Random.nextInt(0, QUOTES.size)]
    }
}