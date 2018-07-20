package keijumt.design_pattern.pattern.templateMethod

class ConcreteTemplateMethod : TemplateMethod() {
    override fun method1() {
        println("method1")
    }

    override fun method2() {
        println("method2")
    }
}