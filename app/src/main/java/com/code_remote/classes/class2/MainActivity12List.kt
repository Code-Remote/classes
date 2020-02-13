package com.code_remote.classes.class2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.code_remote.classes.R

class MainActivity12List : AppCompatActivity() {

    private lateinit var myFirstList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)

        myFirstList = findViewById(R.id.list)
        val list: ArrayList<MyCustomClass> = ArrayList()
        for(count in 1..100){
            list.add(MyCustomClass("I'am Number $count"))
        }
        myFirstList.adapter =
            MyOwnCustomLIstItemAdapter(
                this,
                R.layout.activity_main_list_item,
                list
            )
    }

}

class MyCustomClass ( val name: String) {
}

class MyOwnCustomLIstItemAdapter(
    context: Context,
    resource: Int,
    private val items: List<MyCustomClass>
) :
    ArrayAdapter<MyCustomClass>(context, resource) {

    private val inflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return items.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = convertView ?: inflater.inflate(R.layout.activity_main_list_item, parent, false)

        rootView.findViewById<TextView>(R.id.textView4).text = "List Item title position $position"

        return rootView
    }

}