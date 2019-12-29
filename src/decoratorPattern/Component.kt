package decoratorPattern


interface Beverage {
    val description: String
    val cost: Double
}

//concrete components that we will add new behaviour to it
data class Espresso(override val description: String = "Espresso", override val cost: Double = 1.99) : Beverage

data class HouseBlend(override val description: String = "House Blend Coffee", override val cost: Double = 0.99) : Beverage
