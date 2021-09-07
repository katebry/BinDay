package com.example.binday

import java.text.SimpleDateFormat
import java.util.*

class DateLogic: DateLogicInterface {
    // todo: TDD on below function
    override fun nextWeeksBins(date: String): String {
        val nextWeek = "Sep 14 2021"
        return if (date > nextWeek) "Brown and Pink" else "Blue and Pink"
    }

    // todo: TDD on below function
    override fun findDate(): String {
        val date = Calendar.getInstance().time
        val formatter = SimpleDateFormat.getDateTimeInstance()
        val currentDate = formatter.format(date)

        return nextWeeksBins(currentDate)
    }
}