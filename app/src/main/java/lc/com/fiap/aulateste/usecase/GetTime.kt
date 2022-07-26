package lc.com.fiap.aulateste.usecase

import java.text.SimpleDateFormat
import java.util.Locale
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

object GetTime {
    private val timerFormat: SimpleDateFormat by lazy {
        SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    }

    suspend operator fun invoke(): String {
        return suspendCoroutine {
            val millis = System.currentTimeMillis()
            val time = timerFormat.format(millis)
            it.resume(time)
        }
    }
}