package keijumt.design_pattern.pattern.builder

class Director(private val builder: Builder) {

    fun construct() {
        builder.obj1("abc")
        builder.obj2("def")
        builder.obj3("ghi")
    }
}