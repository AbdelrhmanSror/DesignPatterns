package strategyPattern


fun main() {

    /**
     * Design Principle:
     *  Program to an interface, not an implementation and we did that when initializing the mallard duck below
     *  <br></br>
     *  Favor composition over inheritance. and we did that with flying and quaking behaviour ,we composited them in duck class
     *  <br></br>
     * Identify the aspects of your application that vary and separate them from what stays the same.
     * and that is what we did with flying and quaking behaviour because not every type of duck can fly or can quake
     */
    val duck: Duck = MallardDuck()
    duck.setFlyBehavior(FlyWithWings())
    duck.setQuackBehavior(Quack())
    duck.performQuake()
    duck.performFlying()
}

/**
 * here is the base class u can add behaviours to it during runtime including flying and quaking behaviour
 */
open class Duck {
    protected var flyBehaviour: FlyBehaviour? = null
    protected var quakeBehaviour: QuakeBehaviour? = null
    fun performQuake() {
        quakeBehaviour?.quake()
    }

    fun performFlying() {
        flyBehaviour?.fly()
    }

    open fun setFlyBehavior(fb: FlyBehaviour?) {
        flyBehaviour = fb
    }

    open fun setQuackBehavior(qb: QuakeBehaviour?) {
        quakeBehaviour = qb
    }
}