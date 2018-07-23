package keijumt.design_pattern.pattern.facade

class FacadePattern {

    fun main() {

        val facade = Facade()
        // 複雑な処理をbuild()でしているが、使う側は意識しないで使うことができる。
        facade.build()
    }
}