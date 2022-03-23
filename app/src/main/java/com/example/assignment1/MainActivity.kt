package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button:Button=findViewById(R.id.btn)
        var txt:TextView=findViewById(R.id.loc)
        var flag: String=" "
        var spinval: Spinner= findViewById(R.id.spin)
        var options= arrayOf("Amman","Zarqa","Irbid","Jerash","Aqaba","Madaba","Karak")
        spinval.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        spinval.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                flag="You selected "+ options.get(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        button.setOnClickListener {
            txt.text=flag
        }

    }
}