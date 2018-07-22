package keijumt.design_pattern.pattern.visitor

class VisitorPattern {

    fun main() {
        val concreteAcceptor: Acceptor = ConcreteAcceptor()
        val concreteVisitor: Visitor = ConcreteVisitor()

        concreteAcceptor.accept(concreteVisitor)
    }
}