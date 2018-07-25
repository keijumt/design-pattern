package keijumt.design_pattern.pattern.command

class ConcreteReceiver : Receiver {

    override fun action(msg: String) {
        println(msg)
    }
}