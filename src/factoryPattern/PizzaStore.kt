package factoryPattern

/**
 * Depend upon abstractions.  Do not depend upon concrete classes.
 * pizza store depends only on Pizza and does not care about other types of it
 */
abstract class PizzaStore {
    protected abstract fun createPizza(type: PizzaTypes): Pizza?
    fun orderPizza(type: PizzaTypes): Pizza {
        val pizza: Pizza? = createPizza(type)
        pizza!!.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

}

class NyPizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaTypes): Pizza? {
        return when (type) {
            PizzaTypes.CHEESE -> NYStyleCheesePizza
            PizzaTypes.VEGGIE -> NYStyleVeggiePizza
        }
    }
}

class ChPizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaTypes): Pizza? {
        return when (type) {
            PizzaTypes.CHEESE -> CHStyleCheesePizza
            PizzaTypes.VEGGIE -> CHStyleVeggiePizza
        }
    }
}

