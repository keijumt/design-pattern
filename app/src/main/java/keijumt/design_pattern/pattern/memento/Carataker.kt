package keijumt.design_pattern.pattern.memento

/**
 * Mementoを保持する
 */
class Carataker {

    /**
     * 保持する
     * listでもなんでも可
     */
    var memento: Memento? = null

    fun main() {
        val originator1 = Originator()
        // 0~3の和の計算
        (0..3).forEach { originator1.plus(it) }

        println("0~3までの和は${originator1.getTemp()}")

        // 現在の状態を保持
        memento = originator1.creatememento()

        val originator2 = Originator()
        // 0~3の和の計算の状態をセット
        originator2.setMement(memento!!)
        // 0~6までの和の計算
        (4..6).forEach {
            originator2.plus(it)
        }
        println("0~6までの和は${originator2.getTemp()}")
    }
}

