package ru.elkael.utils

import android.icu.util.Calendar
import java.text.SimpleDateFormat
import java.util.Locale

/** Utility object for handling date and time operations, such as formatting and conversions. */
object DateUtils {
    private val calendar by lazy { Calendar.getInstance() }
    private val logSDF by lazy { SimpleDateFormat(LOG_DATA_PATTEN, Locale.getDefault()) }
    private const val LOG_DATA_PATTEN = "yyyy-MM-dd HH:mm:ss.SS"

    /**
     * Retrieves the current date and time formatted as a string for logging purposes.
     *
     * @return A formatted string representing the current date and time.
     */
    fun getCurrentDataForLog(): String = logSDF.format(calendar.time.time)
}