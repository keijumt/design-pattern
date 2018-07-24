package keijumt.design_pattern.pattern.mediator

class MediatorPattern {

    fun main() {
        // メインとなる仲介役
        val concreteMediator: Mediator = ConcreteMediator()

        // 相談者を作成, 仲介役をコンストラクタで渡しておく
        val colleagueA: Colleague = ConcreteColleague("colleagueA", concreteMediator)
        val colleagueB: Colleague = ConcreteColleague("colleagueB", concreteMediator)

        // 仲介役に各相談者を登録
        concreteMediator.addColleague(colleagueA)
        concreteMediator.addColleague(colleagueB)

        
        colleagueA.run()
        colleagueB.run()
    }
}