/* KOTLIN SYNTAX */

val fruits = listOf("banana", "avocado", "apple", "kiwifruit", "grape")  // collection


// 2. Functions

fun sum(a: Int, b: Int): Int = a + b  // function expression

fun sumPrint(a: Int, b: Int) = println("func \"sumPrint\" -> ${a + b}")


// 3. Classes

// "open" keyword is needed for a class to be inherited
open class Shape() {
    
}

class Rectangle(var width: Double, var height: Double): Shape() {
    var perimeter = 2 * (width + height)
}


// 4. Conditional Expression

fun getBigger(a: Int, b: Int) = if (a > b) a else b


// 5. When Expression

fun getCase(obj: Any) = when(obj) {
    1         -> "one"
    is Double -> "number value of double type"
    else      -> "unknown"
}



/* An Entry Point of a Kotlin Application */

fun main() {
    // 1) how to print
    println("Hello, Koltin")

    print("Hello, ")  // print without a line break
    println("Kotlin")
    

    // 3) functions
	println("func \"sum\" -> ${sum(10, 20)}")
    sumPrint(10, 20)
    

    // 4) class
    val rectangle = Rectangle(10.0, 20.0)
    println("prop \"perimeter\" of class rectangle -> ${rectangle.perimeter}")
    

    // 5) coditional expression
    println("func \"getBigger\" -> ${getBigger(10, 20)}")
    

    // 6) when expressions
    println("func \"getCase\" with 1 -> ${getCase(1)}")
    println("func \"getCase\" with 0.5 -> ${getCase(0.5)}")

    when {
        "apple" in fruits -> println("apple is included")
        "melon" in fruits -> println("melon is included")
    }


    // 7) for loops
    for (fruit in fruits) {
        println(fruit)
    }

    for (index in fruits.indices) {
        println(fruits[index])
    }

	// ranges
	for (x in 1..11 step 2) {
        println(x)
    }
    for (x in 1 until 11 step 2) {
        println(x)
    }
    for (x in 11 downTo 1 step 2) {
        println(x)
    }
	

    // 8) while loop
    var index = 0

    while (index < fruits.size) {
        println(fruits[index])
        index++
    }
    

    // 9) collection
    fruits
    	.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}
