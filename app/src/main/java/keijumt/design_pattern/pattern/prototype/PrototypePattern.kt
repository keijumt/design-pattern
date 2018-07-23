package keijumt.design_pattern.pattern.prototype

class PrototypePattern {

    fun main() {

        val concretePrototype = ConcretePrototype("keijumt")
        for (i in 0 until 10) {
            // クローンを作成
            val clonceConcretePrototype = concretePrototype.createClone()
            clonceConcretePrototype.print()
        }
    }
}