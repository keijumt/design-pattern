package keijumt.design_pattern.pattern.bridge

class RefinedAbstractionA(impl: Implementor) : Abstraction(impl) {

    fun refineMethod() {
        println("追加機能A")
    }
}