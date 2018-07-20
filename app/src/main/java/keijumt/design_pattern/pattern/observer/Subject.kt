package keijumt.design_pattern.pattern.observer

abstract class Subject {

    val observers: MutableList<Observer> = mutableListOf()

    /**
     * observerを登録
     * @param observer
     */
    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    /**
     * observerを解除
     * @param observer
     */
    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    /**
     * 登録されているobserverに更新を通知
     */
    fun updateObservers() {
        for (observer in observers) {
            observer.update()
        }
    }
}