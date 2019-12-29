package factoryPattern

enum class PizzaTypes {
    CHEESE,VEGGIE
}
object NYStyleCheesePizza : Pizza() {
    init {
        name = "“NY Style Sauce and Cheese Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"
        toppings.add("Grated Reggiano Cheese")
    }

}

object NYStyleVeggiePizza : Pizza() {
    init {
        name = "“NY Style Sauce and Veggie Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"
        toppings.add("Grated Reggiano Cheese")
    }

}

object CHStyleCheesePizza : Pizza() {
    init {
        name = "Chicago Style Deep Dish Cheese Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("“Shredded Mozzarella Cheese")
    }

}

object CHStyleVeggiePizza : Pizza() {
    init {
        name = "Chicago Style Deep Dish Veggie Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("“Shredded Mozzarella Cheese")
    }

}
