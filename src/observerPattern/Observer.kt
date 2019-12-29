package observerPattern
interface Observer {
    fun update(temperature: Float = 0f, humidity: Float = 0f, pressure: Float = 0f)
}
