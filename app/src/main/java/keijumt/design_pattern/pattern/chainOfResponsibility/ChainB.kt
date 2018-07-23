package keijumt.design_pattern.pattern.chainOfResponsibility

class ChainB : Handler() {
    override fun method(text: String) {
        println("ChainB : $text")
    }
}