package decoratorPattern

//decorators
interface CondimentsDecorator : Beverage

class Mocha(private val beverage: Beverage) : CondimentsDecorator {
    override val description: String
        get() = beverage.description + " Mocha"
    override val cost: Double
        get() = beverage.cost + 0.20
}

class Whip(private val beverage: Beverage) : CondimentsDecorator {
    override val description: String
        get() = beverage.description + " Whip"
    override val cost: Double
        get() = beverage.cost + 0.20
}
