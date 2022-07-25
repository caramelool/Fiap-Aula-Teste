package lc.com.fiap.aulateste.impl

import lc.com.fiap.aulateste.TimerPresenter
import lc.com.fiap.aulateste.TimerView

class NoopTimerPresenterImpl(
    private val view: TimerView,
) : TimerPresenter {

    override fun startTimer() {
        view.showTime("00:00:00")
    }

    override fun stopTimer() {
        // Do nothing
    }
}
