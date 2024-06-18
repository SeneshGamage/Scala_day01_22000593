package Scala

object cs22000593_02 {
  def celsiusToFahrenheit(celsius: Double): Double = {
  val fahrenheit = (celsius * 1.8) + 32
  fahrenheit
}

// Usage
val celsiusValue = 35.0
val fahrenheitValue = celsiusToFahrenheit(celsiusValue)
println(s"$celsiusValue°C is approximately equal to $fahrenheitValue°F")
}