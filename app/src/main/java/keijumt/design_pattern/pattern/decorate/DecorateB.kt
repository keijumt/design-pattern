package keijumt.design_pattern.pattern.decorate

class DecorateB(private val component: Component) : Decorate(component) {
    private var name: String = "B"

    override fun getName(): String {
        return "${component.getName()} $name"
    }
}