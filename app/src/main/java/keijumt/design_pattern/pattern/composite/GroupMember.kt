package keijumt.design_pattern.pattern.composite

class GroupMember(private val name: String) : GroupEntry {

    override fun printName() {
        println(name)
    }
}