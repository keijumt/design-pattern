package keijumt.design_pattern.pattern.chainOfResponsibility

class ChainC : Handler() {
    override fun method(text: String) {
        println("ChainC : $text")
    }
}