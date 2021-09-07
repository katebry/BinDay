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

            fun nextWeeksBins(date: String): String {
                val nextWeek = "Sep 14 2021"
                return if (date > nextWeek) "Brown and Pink" else "Blue and Pink"
            }

            // todo: TDD on below function
            fun findDate(): String {
                val date = Calendar.getInstance().time
                val formatter = SimpleDateFormat.getDateTimeInstance()
                val currentDate = formatter.format(date)

                return nextWeeksBins(currentDate)
            }


            Toast.makeText(this@MainActivity, findDate(), Toast.LENGTH_LONG).show()
        }
    }
}