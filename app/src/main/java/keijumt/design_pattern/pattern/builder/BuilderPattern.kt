package keijumt.design_pattern.pattern.builder

class BuilderPattern {

    fun main() {

        // GofによるBuilderパターン
        val builder = PojoBuilder()
        val director = Director(builder)
        director.construct()
        val pojo = builder.build()
        pojo.print()
    }
}