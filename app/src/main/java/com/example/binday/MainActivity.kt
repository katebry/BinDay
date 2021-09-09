package com.example.binday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val whichBinBtn = findViewById<Button>(R.id.btn_whichBin)

        val getBinDates = DateLogic()

        whichBinBtn.setOnClickListener {
            val intent = Intent(this, BinData::class.java)
            startActivity(intent)
            // todo: change this from a Toast to actually display the text
            Toast.makeText(this@MainActivity, getBinDates.findDate(), Toast.LENGTH_LONG).show()
        }
    }
}