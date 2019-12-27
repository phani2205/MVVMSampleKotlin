package com.example.mvvmsample.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object Coroutines {

    /*TODO : Learn Higher order function and lymbda expression in kotlin to
       uderstand this below main method properly  */

    fun main(work: suspend (() -> Unit)) = CoroutineScope(Dispatchers.Main).launch {
        work()
    }
}