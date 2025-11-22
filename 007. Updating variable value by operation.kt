fun main()
{
    //// declaring two variables (operands)
    var x = 16
    var y = 15

    //// Updating value of a variable by operation
    //// adding, subtracting, multiplicating, dividing and modding(%) x with 3
    x = x + 3
    println("result_x = $x")
    x = x - 3
    println("result_x = $x")
    x = x * 3
    println("result_x = $x")
    x = x / 3
    println("result_x = $x")
    x = x % 3
    println("result_x = $x")


    //// Short way operation to update value of a variable 
    //// adding, subtracting, multiplicating, dividing and modding(%) y with 4
    y += 4
    println("result_y = $y")
    y -= 4
    println("result_y = $y")
    y *= 4
    println("result_y = $y")
    y /= 4
    println("result_y = $y")
    y %= 4
    println("result_y = $y")

}
