package keijumt.design_pattern.pattern.bridge

class RefinedAbstractionB(impl: Implementor) : Abstraction(impl) {

    fun refineMethod() {
        println("追加機能B")
    }
}