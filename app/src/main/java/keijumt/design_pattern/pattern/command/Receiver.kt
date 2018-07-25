package keijumt.design_pattern.pattern.command

interface Receiver {
    fun action(msg: String)
}