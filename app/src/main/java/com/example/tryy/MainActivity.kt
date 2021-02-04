package com.example.tryy

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var addButton: Button
    private lateinit var clearButton: Button
    private lateinit var editText: EditText
    private lateinit var listView: ListView

// ეს რომ ქვემოთ გადავიტანე, onCreateში, გაიხსნა აპლიკაცია
//    private fun innit(){
//
//        addButton = findViewById(R.id.add)
//        clearButton = findViewById(R.id.clear)
//        editText = findViewById(R.id.textView)
//        listView = findViewById(R.id.listView)
//
//    }

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

        }

        listView.setOnItemClickListener { adapterView, view, i, l ->

            editText.run { setTextColor(Color.GRAY) }

        }

    }
}