package lc.com.fiap.aulateste

interface TimerPresenter {
    fun startTimer()
    fun stopTimer()
}

interface TimerView {
    fun runOnUiThread(runnable: Runnable)
    fun showTime(time: String)
}