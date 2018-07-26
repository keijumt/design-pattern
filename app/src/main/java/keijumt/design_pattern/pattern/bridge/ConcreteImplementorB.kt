package keijumt.design_pattern.pattern.bridge

/**
 * 実装クラス
 */
class ConcreteImplementorB : Implementor() {

    override fun implMethod() {
        println("ConcreteImplementorB : 実装機能")
    }
}