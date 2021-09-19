package com.example.callerfake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_call_.*

class Call_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_)


    }



    fun called(view: View) {


        val phoneNumber = editTextPhone2.editableText.toString()
        var id = editTextPhone.editableText.toString()
       Toast.makeText(this , "Button was Clicked", Toast.LENGTH_SHORT).show()
       val intent = Intent(this, PhoneActivity::class.java)
        intent.putExtra("phoneNumber",phoneNumber)
        startActivity(intent)


    }

}