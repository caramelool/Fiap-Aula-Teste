package lc.com.fiap.aulateste.usecase

import java.text.SimpleDateFormat
import java.util.Locale
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object GetTime {
   private val timerFormat: SimpleDateFormat by lazy {
       SimpleDateFormat("HH:mm:ss", Locale.getDefault())
   }

   suspend operator fun invoke() : String {
       return withContext(Dispatchers.Default) {
           val millis = System.currentTimeMillis()
           timerFormat.format(millis)
       }
   }
}