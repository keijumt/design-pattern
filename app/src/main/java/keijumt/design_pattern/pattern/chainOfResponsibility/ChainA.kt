package keijumt.design_pattern.pattern.chainOfResponsibility

class ChainA : Handler() {
    override fun method(text: String) {
        println("ChainA : $text")
    }
}