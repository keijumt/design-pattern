package keijumt.design_pattern.pattern.proxy

/**
 * RealSubjectの代理のクラス
 */
class Proxy : Subject {

    // 本来のSubject
    private var realSubject: RealSubject? = null

    override fun request1() {
        println("request1 : Proxy")
    }

    override fun request2() {
        println("request3 : Proxy")
    }

    override fun request3() {
        if (realSubject == null) {
            realSubject = RealSubject()
        }
        // realSubjectのメソッドを呼び出す
        realSubject?.request3()
    }
}