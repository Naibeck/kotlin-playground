package functions

/**
 * Functions.kt
 * ------------
 * This class will sum numbers from different methods and
 * will display the same result with 4 different types of
 * functions
 */
fun main(args: Array<String>) {
    println("Two parameter return a total: " + sum(45, 5))
    println("Two parameter perform a total: " + sumInline(45, 5))
    printSum(45, 5)
    omittedUnit(45, 5)
}

/**
 * Function using two parameters and returning the sum of them
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * Function using two parameters and sum them
 * This function does not require to return a value because is
 * inferred
 */
fun sumInline(a: Int, b: Int) = a + b

/**
 * Kotlin syntax corresponding to void in Java
 * Check: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/
 */
fun printSum(a: Int, b: Int): Unit {
    val total: Int = (a + b)
    println("This method executes and give us: " + total)
}

/**
 * Kotlin can suppress Unit type and still will complete the logic
 */
fun omittedUnit(a: Int, b: Int) {
    val total: Int = (a + b)
    println("This method omits the Unit type and executes sum: " + total)
}