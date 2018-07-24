package keijumt.design_pattern.pattern.memento

/**
 * 状態を保持するクラス
 */
class Memento(private val params: Int) {

    fun getParam() = params
}