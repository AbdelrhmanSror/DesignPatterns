package observerPattern

import java.util.*


fun main() {
    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val heatIndexDisplay = HeatIndexDisplay(weatherData)
    weatherData.setMeasurements(80f, 65f, 30.4f)
    weatherData.removeObserver(currentConditionsDisplay)
    weatherData.setMeasurements(70f, 65f, 30.4f)
}


class WeatherData : Observable {
    var temperature: Float? = null
        private set
    var humidity: Float? = null
        private set
    var pressure: Float? = null
        private set
    private val observers: MutableList<Observer?> = ArrayList()

    private fun measurementsChanged() {
        notifyObserver()
    }

    fun setMeasurements(temperature: Float?, humidity: Float?, pressure: Float?) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    override fun registerObserver(o: Observer?) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer?) {
        if (observers.indexOf(o) >= 0) observers.remove(o)
    }

    override fun notifyObserver() {
        for (observer in observers) {
            observer!!.update(temperature!!, humidity!!, pressure!!)
        }
    }
}