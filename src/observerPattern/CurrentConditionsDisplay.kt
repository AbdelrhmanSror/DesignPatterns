package observerPattern

class CurrentConditionsDisplay(private val weatherData: Observable) : Observer, DisplayElements {
    private var temperature: Float? = null
    private var humidity: Float? = null
    private var pressure: Float? = null
    override fun display() {
        println("Current Condition is pressure =$pressure temprature is$temperature humidity is $humidity")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    init {
        //register this class as observer
        weatherData.registerObserver(this)
    }
}