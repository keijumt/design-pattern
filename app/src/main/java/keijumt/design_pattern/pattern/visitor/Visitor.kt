package keijumt.design_pattern.pattern.visitor

abstract class Visitor {
    abstract fun visit(acceptor: Acceptor)
    abstract fun visit(concreteAcceptor: ConcreteAcceptor)
}