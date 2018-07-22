package keijumt.design_pattern.pattern.visitor

class ConcreteVisitor : Visitor() {

    override fun visit(acceptor: Acceptor) {
        println("visit acceptor")
    }

    override fun visit(concreteAcceptor: ConcreteAcceptor) {
        println("visit concrete acceptor")
    }
}