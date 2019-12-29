package observerPattern

interface Observable {
    fun registerObserver(o: Observer?)
    fun removeObserver(o: Observer?)
    fun notifyObserver()
}