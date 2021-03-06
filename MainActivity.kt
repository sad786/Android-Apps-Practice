package com.example.dell.helloworld

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = this.intent
        val bundle = intent.extras
        val msg = bundle.getString(Intent.EXTRA_TEXT)
        if(msg!=null)
        {
            val intent = Intent("com.example.dell.helloworld.SecondActivity")
           // val data = this.findViewById<EditText>(R.id.edit).text.toString()
            intent.putExtra("msg",msg)
            startActivity(intent)
        }
        val btn = this.findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val intent = Intent("com.example.dell.helloworld.SecondActivity")
            val data = this.findViewById<EditText>(R.id.edit).text.toString()
            intent.putExtra("msg",data)
            startActivity(intent)
        }

    }
}
