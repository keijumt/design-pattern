package keijumt.design_pattern.pattern.factoryMethod

abstract class Creator {

    // 継承したクラスにProductの作成をさせる
    abstract fun createProduct(): Product

    fun create() = createProduct()
}