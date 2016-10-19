package variables

/**
 * StringTemplate.kt
 * -----------------
 * This class will show us how to concatenate values on a String
 */
val names: Array<String> = arrayOf("Carlos", "Solano", "Bryan")

fun main(args: Array<String>) {
    /**
     * Declaring a template using an array of strings
     */
    if (names.size > 0) {
        println("First name in array concatenated: ${names[0]}")
        println("Name length: ${names[0].length}")
    }

    /**
     * This is how we concatenate '$' using templates
     */
    val total: Double = 20.0
    println("""The total of your dinner is: ${'$'}$total""")

    //More examples are inside Variables.kt in this same package
}