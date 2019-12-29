package factoryPattern


abstract class PizzaStore {
    protected abstract fun createPizza(type: PizzaTypes): Pizza?
    fun orderPizza(type: PizzaTypes): Pizza {
        val pizza: Pizza? = createPizza(type)
        pizza!!.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza
    }

}

class NYpizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaTypes): Pizza? {
        return when (type) {
            PizzaTypes.CHEESE -> NYStyleCheesePizza()
            PizzaTypes.VEGGIE -> NYStyleVeggiePizza()
            else -> null
        }
    }
}

class CHpizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaTypes): Pizza? {
        return when (type) {
            PizzaTypes.CHEESE -> CHStyleCheesePizza()
            PizzaTypes.VEGGIE -> CHStyleVeggiePizza()
            else -> null
        }
    }
}

