package keijumt.design_pattern.pattern.state

class StatePattern {

    fun main() {
        val service = Service()
        val stopState = StopState()
        val runningState = RunningState()

        service.setState(stopState)
        service.printServiceState()

        service.setState(runningState)
        service.printServiceState()

    }
}