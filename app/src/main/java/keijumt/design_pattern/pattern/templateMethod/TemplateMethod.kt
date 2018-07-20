package keijumt.design_pattern.pattern.templateMethod

abstract class TemplateMethod {
    fun templateMethod() {
        method1()
        method2()
    }

    protected abstract fun method1()
    protected abstract fun method2()
}