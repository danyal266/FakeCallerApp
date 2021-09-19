package com.example.callerfake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_phone_.*

class PhoneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_phone_)
    val numberis =   intent.getStringExtra("phoneNumber")
        phone_number.text = "$numberis"



    }

    fun back(view: View) {
        textView6.start()
    }
    fun ended(view: View) {
        val intentended = Intent(this, Call_Activity::class.java)
        startActivity(intentended)
        Toast.makeText(this, "ended button was clicked", Toast.LENGTH_SHORT).show()
    }


}



