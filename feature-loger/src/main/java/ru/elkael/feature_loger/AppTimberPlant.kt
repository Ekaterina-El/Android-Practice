package ru.elkael.feature_loger

import android.util.Log
import ru.elkael.utils.DateUtils
import timber.log.Timber

/**
 * Custom implementation of [Timber.Tree] for logging in the application.
 * Provides a centralized way to handle log messages with custom formatting or behavior.
 */
object AppTimberPlant : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (BuildConfig.DEBUG || (priority != Log.VERBOSE && priority != Log.DEBUG))
            saveLog(priority, tag, message, t)
    }

    private fun saveLog(priority: Int, tag: String?, message: String, t: Throwable?) {
        val data = DateUtils.getCurrentDataForLog()
        val logString = t?.let { "$data [$tag] $message \n$t" } ?: "$data [$tag] $message"
        Log.i("AppTimberPlant", "logString: $logString")

        // TODO: save to file/buffer/DB/etc or send to server
    }
}