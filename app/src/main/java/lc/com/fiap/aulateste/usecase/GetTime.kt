package lc.com.fiap.aulateste.usecase

import java.text.SimpleDateFormat
import java.util.Locale

object GetTime {
   private val timerFormat: SimpleDateFormat by lazy {
       SimpleDateFormat("HH:mm:ss", Locale.getDefault())
   }

   operator fun invoke() : String {
       val millis = System.currentTimeMillis()
       return timerFormat.format(millis)
   }
}