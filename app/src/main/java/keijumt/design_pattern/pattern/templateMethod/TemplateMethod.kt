package keijumt.design_pattern.pattern.templateMethod

import keijumt.design_pattern.entity.Dog

abstract class TemplateMethod {
    fun templateMethod() {
        val dog = Dog()
        run(dog)
        eat(dog)
    }

    protected abstract fun run(dog: Dog)
    protected abstract fun eat(dog: Dog)
}