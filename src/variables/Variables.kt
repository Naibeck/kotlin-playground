package variables

/**
 * Variables.kt
 * ------------
 * This class will show us how to declare variables in Kotlin
 */

/**
 * We can declare variables and Kotlin is smart enough to assign
 * a type to that variable
 */
val integer = 10
val string = "Hello, World!"
val boolean = false

val int: Int = 10
val str: String = "Type, String!"
val bool: Boolean = false

/**
 * val: is a not mutable variable; this means that the value that it contains
 * can not be modified or assign again
 *
 * var: is a mutable variable; this means that the value that it contains can
 * be modified or assign again
 */
var total: Int = 0

fun main(args: Array<String>) {
    /**
     * This 'println("Variables without type: $integer $string $boolean")' equals to
     * println("Variables without type: " + integer + " " + string + " " +boolean)
     * Ref: String templates https://kotlinlang.org/docs/reference/basic-types.html
     */
    println("Variables without type: $integer $string $boolean")
    total = integer + integer
    println("Sum using variables without type: $total")

    /**
     * You can perform the same results using variables with defined types
     */
    println("Variables without type: $int $str $bool")
    total = int + int
    println("Sum using variables without type: $total")

    /**
     * total variable is a mutable variable, we can modify or perform operations
     * to change it values
     */
    total += 5
    println("Sum 5 to total value: $total")
}
