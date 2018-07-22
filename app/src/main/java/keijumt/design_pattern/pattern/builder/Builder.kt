package keijumt.design_pattern.pattern.builder

import keijumt.design_pattern.entity.Pojo

interface Builder {
    fun obj1(obj1: String)
    fun obj2(obj2: String)
    fun obj3(obj3: String)

    fun build(): Pojo
}