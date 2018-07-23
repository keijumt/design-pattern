package keijumt.design_pattern.pattern.chainOfResponsibility

class ChainOfResponsibility {

    fun main() {
        val chainA: Handler = ChainA()
        val chainB: Handler = ChainB()
        val chainC: Handler = ChainC()

        chainA.setNext(chainB).setNext(chainC)
        chainA.chainStart("keijumt")
    }
}