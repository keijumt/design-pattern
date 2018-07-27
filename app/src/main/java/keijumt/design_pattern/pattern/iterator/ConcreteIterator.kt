package keijumt.design_pattern.pattern.iterator

class ConcreteIterator(private val concreteAggregate: ConcreteAggregate) : Iterator {

    private var index = 0

    /**
     * concreteAggregateが保持しているlistの次のアイテムがあるかどうか(this.indexを元に)
     */
    override fun hasNext(): Boolean = index < concreteAggregate.getSize()

    /**
     * concreteAggregateが保持しているlistからアイテムを取得する
     */
    override fun next(): Int {
        // 現在のindexのアイテムを取得する
        val item = concreteAggregate.getItem(index)
        // indexを+1
        index++
        return item
    }
}