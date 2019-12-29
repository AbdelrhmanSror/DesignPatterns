package strategiePattern


fun main() {
    val duck = MallardDuck()
    duck.setFlyBehavior(FlyWithWings())
    duck.setQuackBehavior(Quack())
    duck.performQuake()
    duck.performFlying()
}


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