package com.example.binday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val whichBinBtn = findViewById<Button>(R.id.btn_whichBin)

        whichBinBtn.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Put out the x and y bins.", Toast.LENGTH_LONG).show()
        }
    }
}