package keijumt.design_pattern.pattern.abstractFactory

class AbstractFactoryPatterm {

    fun main() {
        /**
         * Factory型でfactoryを作成する
         * 仮にConcreteFactory2がでてきたとしても
         * 多様性を利用することができる
         */
        val factory: Factory = ConcreteFactory()
        val name = factory.getName()
    }
}