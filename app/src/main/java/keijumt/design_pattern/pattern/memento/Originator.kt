package keijumt.design_pattern.pattern.memento

class Originator {
    private var temp = 0

    fun plus(value: Int) {
        temp += value
    }

    fun creatememento(): Memento {
        return Memento(temp)
    }

    fun setMement(memento: Memento) {
        this.temp = memento.getParam()
    }

    fun getTemp() = temp
}