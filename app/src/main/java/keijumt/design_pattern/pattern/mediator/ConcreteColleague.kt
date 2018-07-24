package keijumt.design_pattern.pattern.mediator

class ConcreteColleague(private val tag: String, private val mediator: Mediator) : Colleague {

    override fun getTag(): String {
        return tag
    }

    override fun run() {
        // 仲介役に周りのcolleagueの状況を加味してレスポンスをもらう
        val answer = mediator.question(this)
        println("$tag : $answer")
    }
}