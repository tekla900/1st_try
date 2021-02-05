package com.example.tryy

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import java.lang.reflect.Array.set

class MainActivity : AppCompatActivity() {

    private lateinit var addButton: Button
    private lateinit var clearButton: Button
    private lateinit var editText: EditText
    private lateinit var listView: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addButton = findViewById(R.id.add)
        clearButton = findViewById(R.id.clear)
        editText = findViewById(R.id.textView)
        listView = findViewById(R.id.listView)


        var itemlist = mutableListOf<String>()
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, itemlist)

        addButton.setOnClickListener { itemlist.add(editText.text.toString())
            listView.adapter =  adapter

            editText.text.clear() }



        clearButton.setOnClickListener {

            itemlist.clear()
            adapter.notifyDataSetChanged()

        }

        listView.setOnItemClickListener { _, _, _, _ ->

            editText.run { setTextColor(Color.GRAY) }
            editText.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20F)
            editText.paintFlags = editText.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            
//            editText.text = Paint.STRIKE_THRU_TEXT_FLAG

        }

    }
}