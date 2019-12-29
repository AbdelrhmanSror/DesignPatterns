package strategyPattern

class MallardDuck : Duck() {
    override fun setFlyBehavior(fb: FlyBehaviour?) {
        flyBehaviour = fb
    }

    override fun setQuackBehavior(qb: QuakeBehaviour?) {
        quakeBehaviour = qb
    }
}