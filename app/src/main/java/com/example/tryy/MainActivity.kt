package com.example.tryy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var addButton: Button
    private lateinit var clearButton: Button
    private lateinit var deleteButton: Button
    private lateinit var editText: EditText
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemlist = mutableListOf<String>()
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, itemlist)

        addButton.setOnClickListener { itemlist.add(editText.text.toString())
            listView.adapter =  adapter

            editText.text.clear() }

        listView.setOnClickListener{

        }

        clearButton.setOnClickListener {

            itemlist.clear()

        }
    }
}