package keijumt.design_pattern.pattern.factoryMethod

class ConcreteCreator : Creator() {
    override fun createProduct(): Product {
        return ConcreteProduct()
    }
}