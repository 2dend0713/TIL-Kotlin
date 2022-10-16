/* VARIABLES */

// keyword "var" : a variable which can be reassigned
// keyword "val" : a variable which CAN'T be reassigned(just a value)


fun main() {
    val IMMUTABLE_NUMBER = 10  // use snake case with uppercase
    var mutableNumber = 20  // use camel case
    
    mutableNumber++
    
    println(IMMUTABLE_NUMBER)
    println(mutableNumber)
}