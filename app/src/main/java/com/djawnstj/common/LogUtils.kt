package com.djawnstj.common

import android.util.Log

var debug: Boolean = true
private const val EMPTY_TAG = "EMPTY_TAG"

fun debug(tag: String, msg: String?) {
    if (debug) Log.d(tag, msg ?: "message is null")
}

fun debug(msg: String?) {
    println("debug called.")
    debug(EMPTY_TAG, msg)
}
