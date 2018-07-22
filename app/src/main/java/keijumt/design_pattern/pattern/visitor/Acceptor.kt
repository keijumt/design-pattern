package keijumt.design_pattern.pattern.visitor

interface Acceptor {
    fun accept(visitor: Visitor)
}