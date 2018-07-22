package keijumt.design_pattern.pattern.builder

import keijumt.design_pattern.entity.Pojo

class PersonBuilder : Builder {

    private val pojo = Pojo()

    override fun obj1(obj1: String) {
        pojo.obj1 = obj1
    }

    override fun obj2(obj2: String) {
        pojo.obj2 = obj2
    }

    override fun obj3(obj3: String) {
        pojo.obj3 = obj3
    }

    override fun build(): Pojo {
        return pojo
    }
}