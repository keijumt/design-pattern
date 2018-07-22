package keijumt.design_pattern.pattern.composite

class CompositePattern {

    fun main() {
        val mainGroup = Group("mainGroup")
        val subGroupA = Group("subGroupA")
        val subGroupB = Group("subGroupB")
        val groupMemberA = GroupMember("memberA")
        val groupMemberB = GroupMember("memberB")
        val groupMemberC = GroupMember("memberC")

        subGroupA.add(groupMemberA)
        subGroupA.add(groupMemberB)
        subGroupB.add(groupMemberC)

        mainGroup.add(subGroupA)
        mainGroup.add(subGroupB)

        mainGroup.printName()

    }
}