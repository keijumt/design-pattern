package keijumt.design_pattern.pattern.decorate

class DecoratePattern {

    fun main() {
        val decorateA = DecorateA(ConcreteComopnent("ConcreteComponent"))
        val decorateB = DecorateB(ConcreteComopnent("ConcreteComponent"))

        println(decorateA.getName())
        println(decorateB.getName())
    }
}