package com.example.callerfake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun call(view: View) {
        val intent = Intent(this,Call_Activity::class.java)
        startActivity(intent)
        Toast.makeText(this, "Call was Clicked", Toast.LENGTH_SHORT).show()
    }
    fun Message(view: View) {
        val intent  = Intent(this,Message_Activity::class.java)
        startActivity(intent)
        Toast.makeText(this , "Message Button was clicked", Toast.LENGTH_SHORT).show()
    }


}

