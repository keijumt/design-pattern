package keijumt.design_pattern.pattern.bridge

/**
 * 機能追加のベースくらす(委譲によって継承を実現)
 */
open class Abstraction(private val impl: Implementor) {

    fun method() {
        impl.implMethod()
    }
}