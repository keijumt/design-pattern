package keijumt.design_pattern.pattern.command

/**
 * commandを保持、実行するクラス
 * 複数コマンドがある場合はここから利用する
 */
class Invoker {

    /**
     * commandを保持する
     */
    private val commands = mutableListOf<Command>()

    /**
     * commandを追加
     */
    fun addCommand(command: Command) {
        commands.add(command)
    }

    fun removeCommand() {
        if (commands.size > 0) {
            commands.removeAt(commands.size - 1)
        }
    }

    /**
     * commandを実行する
     */
    fun execute() {
        commands.forEach {
            it.execute()
        }
    }
}