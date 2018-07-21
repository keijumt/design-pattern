package keijumt.design_pattern.pattern.templateMethod

import keijumt.design_pattern.entity.Dog

class ConcreteTemplateMethod : TemplateMethod() {
    override fun run(dog: Dog) {
        println("犬が走った")
    }

    override fun eat(dog: Dog) {
        println("犬が食べた")
    }
}