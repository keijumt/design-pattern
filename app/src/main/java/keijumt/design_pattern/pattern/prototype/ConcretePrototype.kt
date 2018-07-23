package keijumt.design_pattern.pattern.prototype

class ConcretePrototype(private val name: String) : Prototype {

    /**
     * クローンを作成する
     * ここでは戻り値を自クラスの型にする
     */
    override fun createClone(): ConcretePrototype {
        val concretePrototype = ConcretePrototype(this.name)
        return concretePrototype
    }

    fun print() {
        println(name)
    }
}