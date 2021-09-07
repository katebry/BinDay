package com.example.binday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val whichBinBtn = findViewById<Button>(R.id.btn_whichBin)

        whichBinBtn.setOnClickListener {
            // todo: TDD / make utils function for below
            fun findDate(): String {
                val date = Calendar.getInstance().time
                val formatter = SimpleDateFormat.getDateTimeInstance()

                return formatter.format(date)
            }

            Toast.makeText(this@MainActivity, findDate(), Toast.LENGTH_LONG).show()
            Toast.makeText(this@MainActivity, "Put out the x and y bins.", Toast.LENGTH_LONG).show()
        }
    }
}