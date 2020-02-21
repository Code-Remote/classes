package com.code_remote.classes.class2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.code_remote.classes.R
import kotlinx.android.synthetic.main.activity_main_button_basics.*

class MainActivity01ButtonBasics : AppCompatActivity() {


    private val toStorageButton: Button by lazy {
        /** by Lazy code is only initialized when being used in the code */
        findViewById<Button>(R.id.to_store_data_button)
    }

    private lateinit var toBetterQuotesButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_button_basics)

        to_resources.setOnClickListener {
            val intent = Intent(this, MainActivity01Resources::class.java)
            startActivity(intent)
        }


        setCounterClickListenerByKotlinSynthetic()
        setGoToListClickListenerByCodeFindViewByID()
        setGoToStorageClickListenerByLazyInit()
        setGoToBetterQuotesClickListenerByLateInit()
    }

    private var counter = 0

    private fun setCounterClickListenerByKotlinSynthetic() {
        counter_button.setOnClickListener {
            counter++
            counter_text.text = "Counter pressed: $counter"
        }
    }

    private fun setGoToListClickListenerByCodeFindViewByID() {
        val toListButton = findViewById<Button>(R.id.to_list_button)
        toListButton.setOnClickListener {
            val intent = Intent(this, MainActivity12List::class.java)
            startActivity(intent)
        }
    }

    /** This function should not be private but public for the XML to see it,
     * also the view itself has to be passed down as a parameter */
    fun goToQuotesClickListenerViaLayoutXml(view: View) {
        val intent = Intent(this, MainActivity02SimpleQuotes::class.java)
        startActivity(intent)
    }

    /** findViewBy ID does not need a type because the type is already specified in the variable*/
    private fun setGoToBetterQuotesClickListenerByLateInit() {
        toBetterQuotesButton = findViewById(R.id.to_better_quotes_button)
        toBetterQuotesButton.setOnClickListener {
            val intent = Intent(this, MainActivity03BetterQuotes::class.java)
            startActivity(intent)
        }
    }

    private fun setGoToStorageClickListenerByLazyInit() {
        toStorageButton.setOnClickListener {
            val intent = Intent(this, MainActivity04StoringData::class.java)
            startActivity(intent)
        }
    }
}