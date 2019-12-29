package observerPattern


import kotlin.math.pow

class HeatIndexDisplay(weatherData: Observable) : Observer, DisplayElements {
    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f
    private var heatIndex = 0.0

    init {
        //register this class as observer
        weatherData.registerObserver(this)
    }

    override fun display() {
        heatIndex = 16.923 + 1.85212 * 10 - 1 * temperature + 5.37941 * humidity - 1.00254 * 10 - 1 * temperature * humidity + 9.41695 * 10 - 3 * temperature.pow(2) + 7.28898 * 10 - 3 * humidity.pow(2) + 3.45372 * 10 - 4 * temperature.pow(2) * humidity - 8.14971 * 10 - 4 * temperature * humidity.pow(2) + 1.02102 * 10 - 5 * temperature.pow(2) * humidity.pow(3) - 3.8646 * 10 - 5 * temperature.pow(3) + 2.91583 * 10 - 5 * humidity.pow(3) + 1.42721 * 10 - 6 * temperature.pow(3) * humidity + 1.97483 * 10 - 7 * temperature * humidity.pow(3) - 2.18429 * 10 - 8 * temperature.pow(3) * humidity.pow(2) + 8.43296 * 10 - 10 * temperature.pow(2) * humidity.pow(3) - 4.81975 * 10 - 11 * temperature.pow(3) * humidity.pow(3)
        print("heatIndex is $heatIndex")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()

    }
}
