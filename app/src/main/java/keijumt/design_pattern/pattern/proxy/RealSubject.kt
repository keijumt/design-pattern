package keijumt.design_pattern.pattern.proxy

class RealSubject : Subject {
    override fun request1() {
        println("request1 : RealSubject")
    }

    override fun request2() {
        println("request2 : RealSubject")
    }

    override fun request3() {
        println("request3 : RealSubject")
    }
}