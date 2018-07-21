package keijumt.design_pattern.pattern.adapter

class Adapter : Adaptee(), Target {
    override fun targetMethod1() {
        super.method1()
    }

    override fun targetMethod2() {
        super.method2()
    }
}