package keijumt.design_pattern.pattern.bridge

class BridgePattern {

    fun main() {
        // 機能追加のベースのクラス(委譲)
        val abstraction: Abstraction = Abstraction(ConcreteImplementorA())

        // 機能追加
        val refinedAbstractionA: RefinedAbstractionA = RefinedAbstractionA(ConcreteImplementorA())
        val refinedAbstractionB: RefinedAbstractionB = RefinedAbstractionB(ConcreteImplementorB())

        abstraction.method()

        refinedAbstractionA.method()
        refinedAbstractionA.refineMethod()

        refinedAbstractionB.method()
        refinedAbstractionB.refineMethod()
    }

}