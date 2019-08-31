package Calculator

fun main(){
    println("Try out my simple calculator: ")
    println("Enter the first operand:")
    var operand1: Double = readLine()?.toDoubleOrNull() ?: 0.0
    println("Enter operation to perform: (+, -, *, /) ")
    var operation: String = readLine().toString()
    println("Enter the second operand: ")
    var operand2: Double = readLine()?.toDoubleOrNull() ?: 0.0
    calculate(operand1, operation,operand2)
}

fun calculate(operand1: Double, operation: String, operand2: Double) {
    when(operation){
        "+" -> println(operand1 + operand2)
        "-" -> println(operand1 - operand2)
        "*"-> println(operand1 * operand2)
        "/"-> println(operand1 / operand2)
        else -> println("Invalid operation")
    }
}
