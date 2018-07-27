package keijumt.design_pattern.pattern.iterator

class ConcreteAggregate : Aggregate {

    private val items: MutableList<Int> = mutableListOf()

    override fun iterator(): Iterator {
        return ConcreteIterator(this)
    }

    /**
     * itemを追加
     */
    fun addItem(item: Int) {
        items.add(item)
    }

    /**
     * itemsのサイズを取得
     */
    fun getSize() = items.size

    /**
     * itemを取得
     */
    fun getItem(index: Int) = items[index]
}