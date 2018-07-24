package keijumt.design_pattern.pattern.mediator

class ConcreteMediator : Mediator {

    val colleagues = HashMap<String, Colleague>()

    override fun addColleague(colleague: Colleague) {
        colleagues.put(colleague.getTag(), colleague)
    }

    override fun question(colleague: Colleague): String {

        println("${colleague.getTag()} : question")

        // 保持しているcolleaguesを利用するなどして、colleagueに戻り値を返す

        return "answer"
    }
}