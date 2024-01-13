package com.example.themesandmenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import com.example.themesandmenus.R.menu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adding toolbar replace of actionBar =============

        val  toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.tool_bar)
        setSupportActionBar(toolbar)
    }

//    adding menu on the appBar====================

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.example_menu,menu)
        return true
    }
//Actions with the menu items=======================
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                Toast.makeText(this@MainActivity, "Item 1 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.item_2 -> {
                Toast.makeText(this@MainActivity, "Item 2 clicked", Toast.LENGTH_SHORT).show()
                return  true
        }

            R.id.sub_menu1 -> {
                Toast.makeText(this@MainActivity, "Sub Item 1 clicked", Toast.LENGTH_SHORT).show()
                return  true

            }
            R.id.sub_menu2 -> {
                Toast.makeText(this@MainActivity, "Sub Item 2 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }


    }
}