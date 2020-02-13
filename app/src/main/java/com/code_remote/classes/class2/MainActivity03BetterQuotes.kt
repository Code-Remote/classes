package com.code_remote.classes.class2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.code_remote.classes.R
import com.code_remote.classes.class2.data.BETTER_QUOTES
import com.code_remote.classes.class2.data.QUOTE_IMAGES
import kotlinx.android.synthetic.main.activity_main_better_quotes.*
import kotlin.random.Random

class MainActivity03BetterQuotes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_better_quotes)
        better_quote_button.setOnClickListener {
            changeQuote()
        }
    }

    private fun changeQuote() {
        val randomNumber = Random.nextInt(0, BETTER_QUOTES.size)
        better_quote_text.text = BETTER_QUOTES[randomNumber]
        better_quote_button.text = "Try again"
        bg_img.setBackgroundResource(QUOTE_IMAGES[randomNumber])
    }
}