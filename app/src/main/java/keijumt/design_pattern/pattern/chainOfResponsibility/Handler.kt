package keijumt.design_pattern.pattern.chainOfResponsibility

abstract class Handler {

    private var nextHandler: Handler? = null

    fun setNext(handler: Handler): Handler {
        nextHandler = handler
        return handler
    }

    fun chainStart(text: String) {
        method(text)
        nextHandler?.chainStart(text)
    }

    // チェインとなるメソッド
    abstract fun method(text: String)
}