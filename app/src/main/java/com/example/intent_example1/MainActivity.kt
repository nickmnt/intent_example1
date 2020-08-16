package com.example.intent_example1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSendMessage(view: View) {
        //In java: Intent intent = new Intent(this, ReceiveMessageActivity.class);

        val intent = Intent(this, ReceiveMessageActivity::class.java)
        val msgBox = findViewById<EditText>(R.id.msgBox)
        intent.putExtra("message", msgBox.text)
        startActivity(intent)
    }
}