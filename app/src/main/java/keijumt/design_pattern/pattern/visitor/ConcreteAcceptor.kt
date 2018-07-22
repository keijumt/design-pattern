package keijumt.design_pattern.pattern.visitor

class ConcreteAcceptor : Acceptor {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}