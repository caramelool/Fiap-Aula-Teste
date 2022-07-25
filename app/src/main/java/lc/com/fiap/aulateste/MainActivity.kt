package lc.com.fiap.aulateste

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import lc.com.fiap.aulateste.impl.NoopTimerPresenterImpl

class MainActivity : AppCompatActivity(), TimerView {

    private val presenter: TimerPresenter = NoopTimerPresenterImpl(this)

    private val timeLabel: TextView by lazy { findViewById(R.id.time) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showTime(time: String) {
        timeLabel.text = time
    }

    override fun onResume() {
        super.onResume()
        presenter.startTimer()
    }

    override fun onPause() {
        super.onPause()
        presenter.stopTimer()
    }
}