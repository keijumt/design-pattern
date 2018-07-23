package keijumt.design_pattern.pattern.flyWeight

class FlyWeightPattern {

    fun main() {
        val flyWeightFactory = FlyWeightFactory()
        flyWeightFactory.get(0).print()
        flyWeightFactory.get(1).print()
        flyWeightFactory.get(0).print()
        flyWeightFactory.get(2).print()
    }
}