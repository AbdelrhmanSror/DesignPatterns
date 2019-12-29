package factoryPattern

import java.util.ArrayList

abstract class Pizza {
    lateinit var name: String
        protected set
    lateinit var dough: String
        protected set

    lateinit var sauce: String
        protected set
    val toppings = ArrayList<String>()

    fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings:")
        for (i in 0 until toppings.size) {
            println(toppings[i])
        }
    }

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in ofﬁcial PizzaStore box")
    }
}
