const val apple = 50
const val Dozens2 = 12

fun main(args: Array<String>) {

    var Dozens = 12
    var noOfDozens  = apple / Dozens
    var remainApple = apple % Dozens
    println("Number Of Dezone ? $noOfDozens")
    println("Remain Number of Apple ? $remainApple")

    // Another way with Teatcher
    var noOfDozens1  = apple / 12
    var remainApple1 = apple % noOfDozens1
    println("Number Of Dezone ? $noOfDozens1")
    println("Remain Number of Apple ? $remainApple1")

    // Another way with Teatcher 2
    var noOfDozens2  = apple / Dozens2
    var remainApple2 = apple % noOfDozens2
    println("Number Of Dezone ? $noOfDozens2")
    println("Remain Number of Apple ? $remainApple2")

    println("Try to get commit")
}