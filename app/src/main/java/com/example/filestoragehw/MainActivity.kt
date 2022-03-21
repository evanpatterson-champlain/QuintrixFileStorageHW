package com.example.filestoragehw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retButton: Button = findViewById<Button>(R.id.retrieve_button)


        retButton.setOnClickListener {
            val msg: String = constructMessage()
            val tv: TextView = findViewById(R.id.textView)
            tv.text = msg
        }

    }

    private fun constructMessage(): String {
        val dir: String = Environment
            .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
            .toString()
        return "External files are stored at:\n$dir"
    }

}