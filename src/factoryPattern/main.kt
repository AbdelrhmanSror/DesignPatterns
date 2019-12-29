package factoryPattern


fun main() {
    val pizzaStore = CHpizzaStore()
    val pizza = pizzaStore.orderPizza(PizzaTypes.CHEESE)
    println("name ${pizza.name} dought ${pizza.dough} sauce ${pizza.sauce} topping ${pizza.toppings[0]}")
}