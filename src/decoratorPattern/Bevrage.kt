package decoratorPattern

fun main() {
    /**
     * Design Principle :
     * Classes should be open for extension, but closed for modification. and that what decorator pattern does
     */
    val espressoWithMocha = Mocha(Espresso())
    val houseBlendWithMocha = Mocha(Whip(HouseBlend()))
    println("${houseBlendWithMocha.description} + ${houseBlendWithMocha.cost}")
}
