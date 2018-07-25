package keijumt.design_pattern.pattern.command

abstract class Command(protected val receiver: Receiver) {
    abstract fun setReceiver(receiver: Receiver)
    abstract fun execute()
}