package com.code_remote.classes.class2

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.code_remote.classes.R

class MainActivity30RecyclerList : AppCompatActivity() {

    private lateinit var myFirstList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler_list)

        myFirstList = findViewById(R.id.recycler_list)
        val list: ArrayList<MyCustomRecyclerObject> = ArrayList()
        for (count in 1..100) {
            list.add(MyCustomRecyclerObject("I'am Number $count"))
        }

        val adapter = MyOwnRecyclerListAdapter(
            this,
            R.layout.activity_main_list_item,
            list
        )
        myFirstList.adapter = adapter
    }

}

class MyCustomRecyclerObject(val name: String) {
}

class MyCustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

}


class MyOwnRecyclerListAdapter(
    context: Context,
    resource: Int,
    private val items: List<MyCustomRecyclerObject>
) : RecyclerView.Adapter<MyCustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyCustomViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}