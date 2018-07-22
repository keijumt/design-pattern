package keijumt.design_pattern.pattern.decorate

class DecorateA(private val component: Component) : Decorate(component) {
    private var name: String = "A"

    override fun getName(): String {
        return "${component.getName()} $name"
    }
}