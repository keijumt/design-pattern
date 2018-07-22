package keijumt.design_pattern.pattern.builder

import keijumt.design_pattern.entity.Pojo

class BuilderPattern {

    fun main() {

        // GofによるBuilderパターン
        val builder = PojoBuilder()
        val director = Director(builder)
        director.construct()
        val pojoGof = builder.build()
        pojoGof.print()

        // EffectiveJavaのBuilderパターン
        val pojoEffective = Pojo.Builder().addObj1("abc").addObj2("def").addObj3("ghi").build()
        pojoEffective.print()
    }
}