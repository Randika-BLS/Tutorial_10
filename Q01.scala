package T10
import scala.io.StdIn

object Q01 {
  def calculateAverage(temperatures: List[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
    val totalFahrenheit = fahrenheitTemperatures.reduce(_ + _)
    val averageFahrenheit = totalFahrenheit / fahrenheitTemperatures.length
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    println("Enter temperatures in Celsius separated by spaces:")
    val input = scala.io.StdIn.readLine()
    val inputTemperatures = input.split(" ").map(_.toDouble).toList
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}
