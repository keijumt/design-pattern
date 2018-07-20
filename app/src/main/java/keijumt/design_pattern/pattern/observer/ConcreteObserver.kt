package keijumt.design_pattern.pattern.observer

class ConcreteObserver : Observer {

    /**
     * Subjectから更新の通知を受ける
     */
    override fun update() {
        println("update")
    }
}