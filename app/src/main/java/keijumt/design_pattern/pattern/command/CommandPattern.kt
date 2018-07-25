package keijumt.design_pattern.pattern.command

class CommandPattern {

    fun main() {
        single()
        multiple()
    }

    /**
     * commandが単体の場合
     */
    fun single() {
        val receiver: Receiver = ConcreteReceiver()

        // commandを作成
        val command: Command = ConcreteCommand1(receiver)
        // commandの中の処理を設定
        command.setReceiver(receiver)
        // commandを実行
        command.execute()
    }

    /**
     * commandが複数の場合
     */
    fun multiple() {
        val receiver: Receiver = ConcreteReceiver()
        // commandを保持しているクラス。commandの起動はこのクラスに任せる。
        val invoker = Invoker()

        // command1を作成
        val command1: Command = ConcreteCommand1(receiver)
        // command1の中の処理を設定
        command1.setReceiver(receiver)
        // invokerにcommandを登録
        invoker.addCommand(command1)

        // command1を作成
        val command2: Command = ConcreteCommand2(receiver)
        // command1の中の処理を設定
        command2.setReceiver(receiver)
        // invokerにcommandを登録
        invoker.addCommand(command2)

        // invokerからコマンドを実行
        invoker.execute()
    }
}