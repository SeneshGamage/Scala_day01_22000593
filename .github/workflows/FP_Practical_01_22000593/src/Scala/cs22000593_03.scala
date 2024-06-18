package Scala

object cs22000593_03 {
  def main(args:Array[String]){
    def calculateSphereVolume(radius: Double): Double = {
  val pi = math.Pi
  (4.0 / 3.0) * pi * math.pow(radius, 3)
}

// Usage
val sphereRadius = 5.0
val volume = calculateSphereVolume(sphereRadius)
println(s"The volume of a sphere with radius $sphereRadius is  $volume cubic units")
  }
}