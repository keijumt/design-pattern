package keijumt.design_pattern.pattern.iterator

class IteratorPattern {

    fun main() {
        val concreteAggregate = ConcreteAggregate()

        // itemを追加
        (0..9).forEach {
            concreteAggregate.addItem(it)
        }

        // iteratorを取得
        val iterator = concreteAggregate.iterator()

        // 次のitemがあった時
        while (iterator.hasNext()) {
            // itemをiteratorから取得する
            val item = iterator.next() as? Int
            println(item)
        }
    }
}