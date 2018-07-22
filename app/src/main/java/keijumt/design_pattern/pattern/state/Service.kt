package keijumt.design_pattern.pattern.state

class Service {
    private var state: State? = null

    fun setState(state: State) {
        this.state = state
    }

    fun printServiceState() {
        state?.printState()
    }
}