package keijumt.design_pattern.pattern.decorate

class ConcreteComopnent(private val name: String) : Component {

    override fun getName(): String {
        return name
    }
}