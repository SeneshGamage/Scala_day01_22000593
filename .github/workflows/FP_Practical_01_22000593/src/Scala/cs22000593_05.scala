package Scala

object cs22000593_05 {
  def main(args:Array[String]){
    object RunningTimeCalculator {
  def main(args: Array[String]): Unit = {
    val easyPaceDistance = 2 // km
    val tempoDistance = 3 // km
    val easyPaceTime = 8 // min/km
    val tempoTime = 7 // min/km

    // Calculate time for each segment
    val easyPaceTotalTime = easyPaceDistance * easyPaceTime
    val tempoTotalTime = tempoDistance * tempoTime

    // Calculate total running time
    val totalRunningTime = easyPaceTotalTime + tempoTotalTime

    println(s"Total running time: $totalRunningTime minutes")
  }
}
  }
}