package keijumt.design_pattern.pattern.singleton

class Singleton1 private constructor() {

    companion object {
        private var instance: Singleton1? = null

        fun getInstance(): Singleton1 {
            if (instance == null) {
                instance = Singleton1()
            }
            return instance!!
        }
    }

    fun print() {
        println("singleton")
    }
}