package Scala

object cs22000593_01 {
  def main(args:Array[String])
  {
    def calculateDiskArea(radius: Double): Double = {
  val pi = math.Pi
  pi * radius * radius
}

// Usage
val radius = 5.0
val area = calculateDiskArea(radius)
println(s"The area of a disk with radius $radius is $area")

  }
}