package keijumt.design_pattern.ui.ui.main

import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel : ViewModel() {

    private var observable = Observable()

    fun addObserver(observer: Observer) {
        println("add observer")
        observable.addObserver(observer)
    }

    fun process() {
        println("process")
        Thread.sleep(100)
        observable.notifyObservers()
    }

}
