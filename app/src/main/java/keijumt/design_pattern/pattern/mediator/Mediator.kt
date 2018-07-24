package keijumt.design_pattern.pattern.mediator

interface Mediator {
    fun addColleague(colleague: Colleague)
    fun question(colleague: Colleague): String
}