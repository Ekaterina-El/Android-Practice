package ru.elkael.feature_loger

import android.util.Log
import timber.log.Timber
import java.util.concurrent.atomic.AtomicBoolean

object TimberLogger: Logger {
    private const val TAG = "Logger"

    private var isInitialized = AtomicBoolean()
    override fun init() {
        if (isInitialized.compareAndSet(false, true)) {
            Timber.plant(AppTimberPlant)
            i(TAG, "TimberLogger was initialized")
            return
        }

        Timber.tag(TAG).w("Logger is already initialized")
    }

    override fun d(tag: String, message: String) = Timber.tag(tag).log(Log.DEBUG, message)
    override fun w(tag: String, message: String) = Timber.tag(tag).log(Log.WARN, message)
    override fun i(tag: String, message: String) = Timber.tag(tag).log(Log.INFO, message)
    override fun e(tag: String, message: String, throwable: Throwable?) {
        Timber.tag(tag).log(Log.ERROR, message, throwable)
    }
    override fun v(tag: String, message: String) = Timber.tag(tag).log(Log.VERBOSE, message)
}