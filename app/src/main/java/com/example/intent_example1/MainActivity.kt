package com.example.intent_example1

import android.content.Intent
import android.content.Intent.createChooser
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSendMessage(view: View) {
        //The user cannot say always use this activity
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT, msgBox.text.toString())
        val title = getString(R.string.chooser)
        val chosenIntent = createChooser(intent, title)
        startActivity(chosenIntent)
    }
}