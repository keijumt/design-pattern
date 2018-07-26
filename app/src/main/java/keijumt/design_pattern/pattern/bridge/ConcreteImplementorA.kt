package keijumt.design_pattern.pattern.bridge

/**
 * 実装クラス
 */
class ConcreteImplementorA : Implementor() {

    override fun implMethod() {
        println("ConcreteImplementorA : 実装機能")
    }
}