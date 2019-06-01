package com.example.avengers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val avengers= arrayOf("Thor","Captain America","Black Widow","Iron Man","Hulk",
            "Hawkeye","Captain Marvel","War Machine","Ant Man","Spider Man","Dr. Strange",
            "Black Panther","Scarlett Witch","Vision","Thanos","Nebula")
        val list=findViewById<ListView>(R.id.avengers)
        val adp= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,avengers)
        list.adapter=adp
        list.setOnItemClickListener { parent, view, position, id ->
            var temp:String=parent.getItemAtPosition(position).toString()
            val intent=Intent(this,Main2Activity::class.java)
            intent.putExtra("listviewclickvalue",temp)
            startActivity(intent)
        }

    }
}
