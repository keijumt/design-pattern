package keijumt.design_pattern.pattern.command

class ConcreteCommand2(receiver: Receiver) : Command(receiver) {

    override fun setReceiver(receiver: Receiver) {
    }

    override fun execute() {
        receiver.action("execute concrete command 2")
    }
}