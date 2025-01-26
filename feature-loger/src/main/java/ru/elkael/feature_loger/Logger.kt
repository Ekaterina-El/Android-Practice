package ru.elkael.feature_loger

/** Interface for a logging utility to provide various levels of log output. */
interface Logger {
    /** Initializes the logger. This method should be called before using any other logging methods. */
    fun init()

    /**
     * Logs a debug message.
     *
     * @param tag A string tag to identify the source of the log message.
     * @param message The message to log.
     */
    fun d(tag: String, message: String)

    /**
     * Logs a warning message.
     *
     * @param tag A string tag to identify the source of the log message.
     * @param message The message to log.
     */
    fun w(tag: String, message: String)

    /**
     * Logs an informational message.
     *
     * @param tag A string tag to identify the source of the log message.
     * @param message The message to log.
     */
    fun i(tag: String, message: String)

    /**
     * Logs an error message.
     *
     * @param tag A string tag to identify the source of the log message.
     * @param message The message to log.
     * @param throwable An optional [Throwable] to include in the log for additional context. Default is `null`.
     */
    fun e(tag: String, message: String, throwable: Throwable? = null)

    /**
     * Logs a verbose message.
     *
     * @param tag A string tag to identify the source of the log message.
     * @param message The message to log.
     */
    fun v(tag: String, message: String)
}