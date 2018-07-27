package keijumt.design_pattern.pattern.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}