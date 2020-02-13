package com.code_remote.classes.class2

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.code_remote.classes.R
import kotlinx.android.synthetic.main.activity_main_shared_pref.*

class MainActivity04StoringData : AppCompatActivity() {

    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_shared_pref)

        sharedPref = getSharedPreferences("MyPersonalkey", MODE_PRIVATE)
        readStoredQuoates()
    }

    private fun readStoredQuoates() {
        val storedQuote = sharedPref.getString("myFirstQuoate", "no quoate found")
        stored_quote.text = storedQuote
    }

    fun storeValue(view: View) {
        val quoteInput = quote_input.text.toString()
        sharedPref.edit().putString("myFirstQuoate", quoteInput).apply()
    }
}
