fun main()
{
    //// declaring two variables (operands)
    var x = 15
    var y = 2

    //// operations (storing calcution results to the new variables)
    var addition = x + y //plus
    var substruction = x - y //minus
    var multiplication = x * y //multiply
    var division = x / y //divide (if both variables store integer, then division result will show in integer)
    var remainder = x % y //remainder

    println("x + y = $addition")
    println("x - y = $substruction")
    println("x * y = $multiplication")
    println("x / y = $division")
    println("x % y = $remainder")
    

    //// declaring a double variable
    var z = 3.0

    //// doing operation between an integer stored variable and a double stored variable (i.e x and z).
    var addition_1 = x + z //plus (result will be double)
    var substruction_1 = x - z //minus (result will be double)
    var multiplication_1 = x * z //multiply (result will be double)
    var division_1 = x / z //divide (result will be double)
    var remainder_1 = x % z //remainder (result will be double)

    println("x + z = $addition_1")
    println("x - z = $substruction_1")
    println("x * z = $multiplication_1")
    println("x / z = $division_1")
    println("x % z = $remainder_1")

    ///[P.S: if you assign integer-integer operation in a variable marked as "var", still you can't change that variable value as assigning integer-double operation in that variable, because it makes type mismatch]
    ///[i.e. if you write "var addition = x + y", you can't change it as "addition = x + z", when x, y are integers and z is double, because "addition" variable has become automatically integer after integer-integer operation and it can't store double value]
    


    //// declaring two variables (operands)
    var a = 30
    var b = 20

    //// operations (without storing calcution results to the new variables, just printing the results)
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")
    

}
