package keijumt.design_pattern.pattern.composite

class Group(private val name: String) : GroupEntry {

    private val groupEntrys: MutableList<GroupEntry> = mutableListOf()

    override fun printName() {
        println(name)
        groupEntrys.forEach {
            it.printName()
        }
    }

    fun add(groupEntry: GroupEntry) {
        groupEntrys.add(groupEntry)
    }
}